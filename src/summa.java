import java.io.BufferedReader;
import java.io.InputStreamReader;
public class summa {



    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        String b = "сумма";
        int i = 0;
        String a = reader.readLine();

        while (!a.equals(b)) {
            i = Integer.parseInt(a);
                sum += i;
                a = reader.readLine();
        }
        System.out.println(sum);

    }

}