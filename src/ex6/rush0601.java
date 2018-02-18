package ex6;

public class rush0601 {
    String name;

    rush0601(String name) {
        this.name = name;
    }

    protected void finalize() throws Throwable {
        System.out.println(name + " destroyed");
    }

    public static void main(String[] args) {


    }
}
