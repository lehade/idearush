package ex6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class rush0610 {



    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        return a;

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ab = reader.readLine();
        int b = Integer.parseInt(ab);
        return b;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ac = reader.readLine();
        double c = Double.parseDouble(ac);
        return c;

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String ad = reader.readLine();
        boolean d = Boolean.parseBoolean(ad);
        return d;
    }

    public static void main(String[] args) {

    }
}