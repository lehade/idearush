public class ducksandcat {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        System.out.println(duck1);
        System.out.println(duck2);
        System.out.println(cat);
        System.out.println(dog);
        System.out.println(cat1);
        System.out.println(dog1);
        //напишите тут ваш код
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }
    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }
    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }

    //напишите тут ваш код
}