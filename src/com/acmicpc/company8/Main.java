package com.acmicpc.company8;

import java.io.*;
// https://www.acmicpc.net/problem/1919
// ์ ๋๊ทธ๋จ
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String userInput1 = bf.readLine();
        String userInput2 = bf.readLine();

        char[] temp1 = userInput1.toCharArray();
        char[] temp2 = userInput2.toCharArray();


        int[] alpha = new int[127];

        for (char a :
                temp1) {
            alpha[a]++;
        }
        for (char a :
                temp2) {
            alpha[a]--;
        }

        int count = 0;

        for (int i :
                alpha) {
            count += Math.abs(i);
        }

        bw.write("" + count);
        bw.flush();
        bw.close();
        bf.close();


    }
}
