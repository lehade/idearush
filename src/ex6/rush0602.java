package ex6;

public class rush0602 {

    public static void main(String[] args) {

    }

    //напишите тут ваш код
    protected void finalize() throws Throwable
    {
        System.out.println("Cat was destroyed");
    }

}

class Dog {
    //напишите тут ваш код
    protected void finalize() throws Throwable
    {
        System.out.println("Dog was destroyed");
    }
}
