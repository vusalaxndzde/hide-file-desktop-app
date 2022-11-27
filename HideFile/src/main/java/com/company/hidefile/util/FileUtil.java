/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.company.hidefile.util;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Asus
 */
public class FileUtil {
    
    public static byte[] readBytes(String filename) throws Exception {
        try (FileInputStream reader = new FileInputStream(filename)) {
            return reader.readAllBytes();
        }
    }

    private static void writeBytes(String filename, byte[] arr, boolean append) throws Exception {
        try (FileOutputStream writer = new FileOutputStream(filename, append)) {
            writer.write(arr);
        }
    }

    public static void appendBytes(String filename, byte[] arr) throws Exception {
        writeBytes(filename, arr, true);
    }

    public static void writeBytes(String filename, byte[] arr) throws Exception {
        writeBytes(filename, arr, false);
    }

    public static String newFileName(String filename, String extension) {
        String[] arr = filename.split("[.]");
        return arr[0] + " - new." + extension;
    }

    public static String getExtension(String filename) {
        String[] arr = filename.split("[.]");
        return arr[1];
    }
    
}
