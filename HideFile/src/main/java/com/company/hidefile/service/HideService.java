package com.company.hidefile.service;

import com.company.hidefile.bean.Config;
import com.company.hidefile.util.FileUtil;

public class HideService {
    
    private static void hide(String imagePath, byte[] secretText, String fileExtension) throws Exception {
        String container = imagePath;
        String steqoFile = FileUtil.newFileName(container, FileUtil.getExtension(container));
        FileUtil.writeBytes(steqoFile, FileUtil.readBytes(container));

        FileUtil.appendBytes(steqoFile, secretText);
        FileUtil.appendBytes(steqoFile, (Config.getExtensionKey() + fileExtension).getBytes());
    }

    public static void hideFile(String imagePath, String filePath) throws Exception {
        byte[] secretText = FileUtil.readBytes(filePath);
        String fileExtension = FileUtil.getExtension(filePath);
        hide(imagePath, secretText, fileExtension);
    }

    public static void hideText(String imagePath, String text) throws Exception {
        byte[] secretText = text.getBytes();
        String fileExtension = "txt";
        hide(imagePath, secretText, fileExtension);
    }
    
}
