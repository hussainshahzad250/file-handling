package com.file.basic;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileUsingBufferedOutputStream {

    public static void main(String[] args) throws Exception {
        String fileName = "myfile.txt";
        writeFileWay1(fileName);
        writeFileWay2(fileName);
    }

    private static void writeFileWay1(String fileName) throws IOException {
        try (BufferedOutputStream bufferedOutput = new BufferedOutputStream(new FileOutputStream(fileName))) {
            bufferedOutput.write("Line one".getBytes());
            bufferedOutput.write("\n".getBytes());
            bufferedOutput.write("Line two".getBytes());
            System.out.println("Done");
        }
    }

    private static void writeFileWay2(String fileName) throws IOException {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(fileName)))) {
            bos.write("this is a test".getBytes());
            bos.flush();
            System.out.println("Done");
        }
    }
}
