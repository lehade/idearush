package ex6;

public class rush0603 {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 50000 ; i++) {
            Cat cat = new Cat();
            Dog1 dog = new Dog1();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cat was destroyed");
    }
}

class Dog1 {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Dog was destroyed");
    }
}