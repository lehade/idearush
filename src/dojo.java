import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class dojo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();
        String lastName = scanner.next();
        String ageS = scanner.next();
        String heightS = scanner.next();
        String weightS = scanner.next();
        int age = Integer.parseInt(ageS);
        double height = Double.parseDouble(heightS);
        double weight = Double.parseDouble(weightS);

        String name = fullName(firstName, lastName);

        printData(name, age, height, weight);

    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void printData(String name, int age, double height, double weight) {
        //System.out.println(fullName(firstName, lastName));
        System.out.println("My name is " + name + ".");
        System.out.println("I am " + age + " years old.");
        if (age >= 18) {
            System.out.println("I am an adult.");
        }
        else {
            System.out.println("I am not an adult.");
        }
        System.out.println("I am " + height + "m tall.");
        System.out.println("I weigh " + weight + "kg.");
    }

}