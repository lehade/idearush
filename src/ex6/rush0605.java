package ex6;

import java.io.*;

public class rush0605 {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(r.readLine());
        int s;
        while (i != 0) {
            s = i % 10;
            i /= 10;
            if (s % 2 == 0) {
                ++even;
            } else {
                ++odd;
            }
        }
        System.out.print("Even: " + even);
        System.out.println(" Odd: " + odd);


    }
}