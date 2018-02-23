package ex6;
import java.io.*;

public class rush0620 {

        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String max = "Max is ";
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());

            if (a > b) {
                System.out.println(max + " " + a);
            }
            else {
                System.out.println(max + " " + b);
            }

        }

    }