public class pers_initialize {
    public static void main(String[] args) {

        Person person = new Person();
        person.initialize("sss", 15);

    }

    static class Person {
        String name;
        int age;

        public void initialize(String name, int age)
        {
            this.name = name;
            this.age = age;
        }


    }
}