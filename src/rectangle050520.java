public class rectangle050520 {

    int top;
    int left;
    int width;
    int height;

    public rectangle050520 (int top, int left, int width, int height ) {
    this.top = top;
    this.left = left;
    this.width = width;
    this.height = height;
    }

    public rectangle050520 (int top, int left ) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public rectangle050520 (int top, int left, int width ) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public rectangle050520(rectangle050520 other) {
        this.top = other.top;
        this.left = other.left;
        this.width = other.width;
        this.height = other.height;
    }

    public static void main(String[] args) {

    }
}
