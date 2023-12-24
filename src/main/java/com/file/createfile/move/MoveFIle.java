package com.file.createfile.move;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveFIle {

    public static void main(String[] args) throws Exception {
        Path sourceFile = Paths.get("D:\\wall\\1.jpg");
        Path destinationFile = Paths.get("D:\\wall\\HD\\1.jpg");
        Files.move(sourceFile, destinationFile, StandardCopyOption.ATOMIC_MOVE);
        System.out.println("Done");

    }
}