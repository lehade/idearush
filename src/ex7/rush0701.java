package ex7;

import java.io.*;

public class rush0701 {

    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];
        for (int i = 0; i < 20; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        return list;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int maxim = array[0];
        for (int i=1; i<array.length; i++){
            if (array[i]>maxim){
                maxim = array[i];
            }
        }

        return maxim;
    }
}