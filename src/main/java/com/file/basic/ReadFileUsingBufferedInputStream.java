package com.file.basic;

import java.io.*;

public class ReadFileUsingBufferedInputStream {

    public static void main(String[] args) throws Exception {
        File file = new File("D:\\file-handling\\myfile.txt");
        readFileWay1(file);
        System.out.println("");
        readFileWay2(file);
    }

    private static void readFileWay1(File file) throws IOException {
        FileInputStream fin = new FileInputStream(file);
        try (BufferedInputStream bin = new BufferedInputStream(fin)) {
            while (bin.available() > 0) {
                System.out.print((char) bin.read());
            }
        }
    }

    private static void readFileWay2(File file) throws IOException {
        FileInputStream fin = new FileInputStream(file);
        try (BufferedInputStream bin = new BufferedInputStream(fin)) {
            byte[] contents = new byte[1024];
            int bytesRead = 0;
            String strFileContents;
            while ((bytesRead = bin.read(contents)) != -1) {
                strFileContents = new String(contents, 0, bytesRead);
                System.out.print(strFileContents);
            }
        }
    }
}
