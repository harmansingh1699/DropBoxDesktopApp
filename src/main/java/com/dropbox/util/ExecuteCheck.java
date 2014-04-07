/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dropbox.util;

import com.dropbox.webservice.cloudoperations.CloudOperationsService_Service;
import com.dropbox.webservice.contracts.cloudoperations.DropBoxDownloadRequest;
import com.dropbox.webservice.contracts.cloudoperations.DropBoxDownloadResponse;
import com.dropbox.webservice.contracts.cloudoperations.DropBoxGetFilesRequest;
import com.dropbox.webservice.contracts.cloudoperations.DropBoxGetFilesResponse;
import com.dropbox.webservice.contracts.cloudoperations.DropBoxUploadRequest;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.util.Duration;

/**
 *
 * @author ravjotsingh
 */
public class ExecuteCheck {

    private static String userName;
    private static String password;

    public ExecuteCheck() {
        try {
            BufferedReader b = new BufferedReader(new FileReader(new File("userDetails.cloudSync")));
            this.userName = b.readLine();
            this.password = b.readLine();
            b.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public byte[] fileToByte(File file) {
        byte[] bytes = new byte[(int) file.length()];
        try {
            FileInputStream is = new FileInputStream(file);
            is.read(bytes);
            is.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return bytes;
    }

    public void start() {
        Timeline fiveSecondsWonder = new Timeline(new KeyFrame(Duration.seconds(5), new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                HashMap<String, String> map = getFiles();
                System.out.println(map.size());
                File file = new File("CloudSync");
                
                if(!file.exists())
                    file.mkdir();
                File[] files = file.listFiles();

                if (files.length > 0) {
                    if (map.size() > 0) {
                        for (File f : files) {
                            if (map.containsKey(f.getAbsoluteFile())) {
                                if (!map.get(f.getAbsoluteFile()).equals(CheckSumGeneration.generateChecksumOfFile(f.getAbsolutePath()))) {
                                    System.out.println(f.getAbsoluteFile());

                                    map.put(f.getAbsolutePath(), CheckSumGeneration.generateChecksumOfFile(f.getAbsolutePath()));

                                    CloudOperationsService_Service port = new CloudOperationsService_Service();
                                    DropBoxUploadRequest request = new DropBoxUploadRequest();
                                    request.setUserName(userName);
                                    request.setPassword(password);
                                    request.setFileName(f.getName());
                                    request.setFile(fileToByte(f));
                                    try {
                                        port.getCloudOperationsPort().uploadFile(request);
                                    } catch (com.dropbox.webservice.cloudoperations.Exception ex) {
                                        Logger.getLogger(ExecuteCheck.class.getName()).log(Level.SEVERE, null, ex);
                                    }

                                }
                            } else {
                                map.put(f.getAbsolutePath(), CheckSumGeneration.generateChecksumOfFile(f.getAbsolutePath()));
                                System.out.println(f.getAbsoluteFile());
                                CloudOperationsService_Service port = new CloudOperationsService_Service();
                                DropBoxUploadRequest request = new DropBoxUploadRequest();
                                request.setUserName(userName);
                                request.setPassword(password);
                                request.setFileName(f.getName());
                                request.setFile(fileToByte(f));
                                try {
                                    port.getCloudOperationsPort().uploadFile(request);
                                } catch (com.dropbox.webservice.cloudoperations.Exception ex) {
                                    Logger.getLogger(ExecuteCheck.class.getName()).log(Level.SEVERE, null, ex);
                                }
                            }
                        }
                    } else {
                        map = new HashMap<>();

                        for (File f : files) {
                            map.put(f.getAbsolutePath(), CheckSumGeneration.generateChecksumOfFile(f.getAbsolutePath()));
                            CloudOperationsService_Service port = new CloudOperationsService_Service();
                            DropBoxUploadRequest request = new DropBoxUploadRequest();
                            request.setUserName(userName);
                            request.setPassword(password);
                            request.setFileName(f.getName());
                            request.setFile(fileToByte(f));
                            try {
                                port.getCloudOperationsPort().uploadFile(request);
                            } catch (com.dropbox.webservice.cloudoperations.Exception ex) {
                                Logger.getLogger(ExecuteCheck.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            System.out.println(f.getAbsolutePath());
                        }

                    }
                    System.out.println("Hello");
                    writeFile(map);
                    System.out.println("Gello");
                } else {
                    CloudOperationsService_Service port = new CloudOperationsService_Service();
                    DropBoxGetFilesRequest request = new DropBoxGetFilesRequest();
                    request.setPassword(password);
                    request.setUserName(userName);
                    DropBoxGetFilesResponse response = port.getCloudOperationsPort().getFiles(request);

                    for (String file1 : response.getFilesName()) {
                        DropBoxDownloadRequest request1 = new DropBoxDownloadRequest();
                        request1.setFileName(file1);
                        request1.setUserName(userName);
                        request1.setPassword(password);
                        DropBoxDownloadResponse response1 = port.getCloudOperationsPort().downloadFile(request1);

                        byte[] bfile = response1.getFile();
                        if (bfile != null && bfile.length > 0) {
                            try {
                                FileOutputStream fileOuputStream
                                        = new FileOutputStream("CloudSync/" + file1);
                                fileOuputStream.write(bfile);
                                fileOuputStream.close();
                            } catch (IOException ex) {
                                Logger.getLogger(ExecuteCheck.class.getName()).log(Level.SEVERE, null, ex);
                            }
                        }
                    }
                }
            }

        }));
        fiveSecondsWonder.setCycleCount(Timeline.INDEFINITE);
        fiveSecondsWonder.play();
    }

    public void writeFile(HashMap<String, String> map) {
        File file = new File("List.cloudsync");

        Iterator it = map.entrySet().iterator();
        System.out.println("try se pehle");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            while (it.hasNext()) {
                Map.Entry pairs = (Map.Entry) it.next();
                System.out.println(pairs.getKey() + " = " + pairs.getValue());

                bw.append(pairs.getKey() + "," + pairs.getValue());
                bw.newLine();
            }
            bw.close();

            System.out.println("bw.close");
        } catch (IOException ex) {
            Logger.getLogger(ExecuteCheck.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public HashMap<String, String> getFiles() {
        HashMap<String, String> map = new HashMap<>();
        File file = new File("List.cloudsync");
        if (file.exists()) {
            BufferedReader b;
            System.out.println("dusre try se pehle");
            try {
                b = new BufferedReader(new FileReader(file));
                String value = b.readLine();

                while (value != null) {
                    StringTokenizer tokens = new StringTokenizer(value, ",");
                    map.put(tokens.nextToken(), tokens.nextToken());
                    value = b.readLine();
                }
                b.close();
                System.out.println("b.close");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(ExecuteCheck.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(ExecuteCheck.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return map;
    }

}
