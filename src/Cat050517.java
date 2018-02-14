public class Cat050517 {

    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat050517 (String name) {
        this.name=name;
        this.age=1;
        this.weight=3;
        this.address=null;
        this.color="null";
    }

    public Cat050517 (String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "color";
    }

    public Cat050517 (String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 4;
        this.color = "aaaaa";
    }

    public Cat050517 (int weight, String color) {
        this.age = 5;
        this.weight = weight;
        this.color = color;
    }

    public Cat050517 (int weight, String color, String address) {
        this.weight= weight;
        this.age = 5;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}