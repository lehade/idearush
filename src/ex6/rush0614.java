package ex6;
import sun.tools.tree.NewArrayExpression;

import java.util.ArrayList;

public class rush0614 {
    //напишите тут ваш код
    public static ArrayList<Cat> cats = new ArrayList<>();

    public rush0614() {

    }

    public static void main(String[] args) {
        //напишите тут ваш код
        Cat mur = new Cat();
        Cat vaska = new Cat();
        Cat murka = new Cat();
        Cat ruzik = new Cat();
        Cat matros = new Cat();//5
        Cat pushok = new Cat();
        Cat barsik = new Cat();
        Cat kuzia = new Cat();
        Cat kasi = new Cat();
        Cat marusia = new Cat();

        cats.add(mur);
        cats.add(vaska);
        cats.add(murka);
        cats.add(ruzik);
        cats.add(matros);
        cats.add(pushok);
        cats.add(barsik);
        cats.add(kuzia);
        cats.add(kasi);
        cats.add(marusia);
        printCats();
    }

    public static void printCats() {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            System.out.println(cats.get(i));
        }
    }
}