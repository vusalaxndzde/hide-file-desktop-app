package com.company.hidefile.service;

import com.company.hidefile.bean.Config;
import com.company.hidefile.util.FileUtil;

public class ExtractService {
    
    private String extStr;
    private String stegoFile;
    
    public byte[] extract(String imagePath) throws Exception {
        stegoFile = imagePath;
        byte[] content = FileUtil.readBytes(stegoFile);

        String extKey = Config.getExtensionKey();
        int indexExt = findExtensionIndex(content, extKey);
        extStr = getExtension(indexExt, content);

        String hexCode = Config.getHexKey();
        return getSecretContent(hexCode, indexExt, extKey, content);
    }
    
    public void extractToFile(byte[] secretArr) throws Exception {
        FileUtil.writeBytes(FileUtil.newFileName(stegoFile, extStr), secretArr);
    }
    
    private byte[] getSecretContent(String hexCode, int indexExt, String extKey, byte[] content) {
        byte[] key = hexStringToByteArray(hexCode);
        int index = findSecretContentIndex(content, key);
        byte[] secretArr = new byte[indexExt - extKey.length() - index];
        for (int i = 0; i < secretArr.length; i++, index++) {
            secretArr[i] = content[index];
        }
        return secretArr;
    }

    private String getExtension(int indexExt, byte[] content) {
        byte[] extArr = new byte[content.length - indexExt];
        for (int i = 0; i < extArr.length; i++, indexExt++) {
            extArr[i] = content[indexExt];
        }
        return new String(extArr);
    }

    private int findSecretContentIndex(byte[] content, byte[] key) {
        int index = 0;
        for (int i = 0; i < content.length; i++) {
            if (content[i] == key[0]) {
                if (check(i, content, key)) {
                    index = i + key.length;
                }
            }
        }
        return index;
    }

    private int findExtensionIndex(byte[] content, String extKeyStr) {
        byte[] extKey = extKeyStr.getBytes();
        int index = 0;
        for (int i = 0; i < content.length; i++) {
            if (content[i] == extKey[0]) {
                if (check(i, content, extKey)) {
                    index = i + extKey.length;
                    break;
                }
            }
        }
        return index;
    }

    private boolean check(int index, byte[] content, byte[] extKey) {
        int keyIndex = 0;
        while (keyIndex != extKey.length) {
            if (extKey[keyIndex] != content[index]) {
                return false;
            }
            keyIndex++;
            index++;
        }
        return true;
    }

    private byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
    
}
