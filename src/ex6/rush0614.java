package ex6;
import java.util.ArrayList;

public class rush0614 {
    //напишите тут ваш код

    public static ArrayList<Cat> cats = new ArrayList<>();

   // public Cat() {

    //}

    public static void main(String[] args) {
        //напишите тут ваш код

        for (int i = 0; i < 10; i++) {
            new Cat();
            cats.add(new Cat());
        }
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        System.out.println(cats);


    }
}