package com.file.basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedReaderFromSystem {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String strLine = in.readLine();
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        out.write(strLine, 0, strLine.length());
        out.flush();
        in.close();
        out.close();
    }
}
