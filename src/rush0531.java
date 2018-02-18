import java.io.*;
public class rush0531 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());

        int m = minimum(a, b, c, d, e);

        System.out.println("Minimum = " + m);

    }

    public static int minimum(int a, int b, int c, int d, int e) {
        if (a < b && a < c && a < d && a < e)
            return a;
        else if (b < a && b < c && b < d && b < e)
            return b;
        else if (c < a && c < b && c < d && c < e)
            return c;
        else if (d < a && d < c && d < b && d < e)
            return d;
        else
            return e;

    }

}
