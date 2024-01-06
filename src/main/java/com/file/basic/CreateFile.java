package com.file.basic;

// Import the File class
import java.io.File;

// Import the IOException class to handle errors
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {

        try {
            File obj = new File("myfile.txt");
            if (obj.createNewFile()) {
                System.out.println("File created: " + obj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}