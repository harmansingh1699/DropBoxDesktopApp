/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.dropbox.util;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ravjotsingh
 */
public class IgnoreSystemFileFilter implements FileFilter {

   Set<String> systemFileNames = new HashSet<String>(Arrays.asList("sys", "etc"));

   @Override
   public boolean accept(File aFile) {
     return (!aFile.getName().startsWith(".") || !aFile.isHidden()) && (!systemFileNames.contains(aFile.getName()));
 }
}