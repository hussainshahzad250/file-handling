package com.file.basic;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class ReadFromFileWithBufferedInputStream {

    public static void main(String[] args) throws Exception {
        byte[] buffer = new byte[1024];
        try (BufferedInputStream bufferedInput = new BufferedInputStream(new FileInputStream("myfile.txt"))) {
            int bytesRead = 0;
            while ((bytesRead = bufferedInput.read(buffer)) != -1) {
                String chunk = new String(buffer, 0, bytesRead);
                System.out.print(chunk);
            }
        }
    }
}
