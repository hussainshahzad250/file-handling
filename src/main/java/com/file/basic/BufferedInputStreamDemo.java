package com.file.basic;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

//Create BufferedInputStream from FileInputStream
class BufferedInputStreamDemo {

    public static void main(String[] args) throws Exception {
      File file = new File("D:\\file-handling\\myfile.txt");
      FileInputStream fis = new FileInputStream(file);

        try (BufferedInputStream bis = new BufferedInputStream(fis)) {
            int i;
            while ((i = bis.read()) != -1) {
                System.out.println(i);
            }
        }
    }
}