package ex6;

public class rush0604 {
    public static int catCount = 0;

    public rush0604(){
        catCount++;
    }

    protected void finalize()throws Throwable{
        catCount--;
    }

    public static void main(String[] args) {

    }
}
