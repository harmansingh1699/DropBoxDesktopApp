package com.dropbox.main;

import com.dropbox.controller.ScreenNavigator;
import com.dropbox.util.CommonValidations;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    private double xOffset = 0;
    private double yOffset = 0;

    @Override
    public void start(final Stage stage) throws Exception {
        ScreenNavigator screenNavigator = new ScreenNavigator();
        screenNavigator.loadScreen("registration", "/com/dropbox/fxml/RegistrationSceneFXML.fxml");
        screenNavigator.loadScreen("login", "/com/dropbox/fxml/LoginSceneFXML.fxml");
        screenNavigator.loadScreen("shareFile", "/com/dropbox/fxml/ShareFileSceneFXML.fxml");
        screenNavigator.loadScreen("downloadSharedFile", "/com/dropbox/fxml/DownloadSharedFileSceneFXML.fxml");
        
        boolean first = true;
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File("userDetails.cloudSync")));
            String userName = reader.readLine();
            String password = reader.readLine();
            
            if(CommonValidations.isStringEmpty(userName) && CommonValidations.isStringEmpty(password)){
                first = false;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        if(first)
            screenNavigator.setScreen("login");
        else
            screenNavigator.setScreen("shareFile");
        FlowPane root = new FlowPane();
        root.getChildren().addAll(screenNavigator);
        root.setOnMousePressed(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                xOffset = event.getSceneX();
                yOffset = event.getSceneY();
            }
        });

        root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() - xOffset);
                stage.setY(event.getScreenY() - yOffset);
            }
        });
        root.autosize();
        Scene scene = new Scene(root);

        //stage.initStyle(StageStyle.UNDECORATED);
        stage.sizeToScene();
        stage.setScene(scene);
        stage.setResizable(false);
        stage.centerOnScreen();
        stage.setTitle("CloudShare");
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
