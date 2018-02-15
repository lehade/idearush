public class circleconst050521 {

    public double x;
    public double y;
    public double radius;

    public circleconst050521(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public circleconst050521(double x, double y) {
        this(x, y, 10.5);
        this.x = x;
        this.y = y;
        this.radius = 10;

    }

    public circleconst050521() {
        this(5, 5, 1);
    }

    public static void main(String[] args) {
        circleconst050521 circle = new circleconst050521();
        System.out.println(circle.x + " " + circle.y + " " + circle.radius);
        circleconst050521 anotherCircle = new circleconst050521(10, 5);
        System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
    }
}
