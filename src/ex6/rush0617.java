package ex6;

public class rush0617 {

    public static void main(String[] args) {
        printIdea(new Idea());
    }


    //напишите тут ваш код


    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }
    public static class Idea {
        public String getDescription() {
            return "s";
        }
    }
}