public class ErrCircle {
    public Color color;

    public static void main(String[] args) {
        ErrCircle circle = new ErrCircle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public ErrCircle() {
        color = new Color();
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}