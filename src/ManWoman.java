public class ManWoman {
    public static void main(String[] args) {

        Man man = new Man("bbb", 23, "ggg");
        Man man1 = new Man("bbb1", 23, "ggg1");
        Woman woman = new Woman("aaa", 22,  "hhh");
        Woman woman1 = new Woman("aaa1", 22,  "hhh1");
        System.out.println(man);
        System.out.println(man1);
        System.out.println(woman);
        System.out.println(woman1);

    }

    public static class Man {

        String name;
        int age;
        String address;

        public Man (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }

    }

    public static class Woman {

        String name;
        int age;
        String address;

        public Woman (String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString() {
            return this.name + " " + this.age + " " + this.address;
        }
    }
}