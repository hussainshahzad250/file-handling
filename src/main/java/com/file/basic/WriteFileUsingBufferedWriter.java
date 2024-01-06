package com.file.basic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class WriteFileUsingBufferedWriter {

    public static void main(String[] args) throws Exception {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("myfile.txt"))) {
            bufferedWriter.write("This is my comment");
            bufferedWriter.newLine();
            bufferedWriter.write("i am sorry");
            bufferedWriter.close();
        }
        System.out.println("Please enter something...");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        FileWriter fileWriter = new FileWriter("hellow.txt");
        fileWriter.write(input);
        fileWriter.close();
        System.out.println("Done");
    }
}
