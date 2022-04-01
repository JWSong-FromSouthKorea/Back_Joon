package com.company;

import java.io.*;

public class Main {

    public  static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int MaxLoop = Integer.parseInt(br.readLine());
        for(int i = 0; i <= MaxLoop; i++) {
            bw.write(getBinary(i));
        }
        bw.flush();
    }

    private static String getBinary(int param) {
        return Integer.toBinaryString(param);
    }
}
