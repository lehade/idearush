package ex6;

import java.io.*;

public class rush0621 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String gfatherName = reader.readLine();
        Cat catGFather = new Cat(gfatherName);

        String gmotherName = reader.readLine();
        Cat catGMother = new Cat(gmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catGFather);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGMother ,null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGFather);
        System.out.println(catGMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parentf;
        private Cat parentm;
        private Cat parentgf;
        private Cat parentgm;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentm, Cat parentf) {
            this.name = name;
            this.parentm = parentm;
            this.parentf = parentf;
        }

        Cat(String name, Cat parentm, Cat parentf, Cat parentgf, Cat parentgm) {
            this.name = name;
            this.parentm = parentm;
            this.parentf = parentf;
            this.parentgf = parentgf;
            this.parentgm = parentgm;
        }

        @Override
        public String toString() {
            if ((parentf == null) & (parentm == null))
                return "Cat name is " + name + ", no mother, no father ";
            if ((parentf != null) & (parentm == null))
                return "Cat name is " + name + ", no mother " + ", father is " + parentf.name;
            if ((parentm != null) & (parentf == null))
                return "Cat name is " + name + ", mother is" + parentm.name +" , no father";
            /*if ((parentf != null) & (parentm != null))*/
                return "Cat name is " + name + ", mother is " + parentm.name + ", father is " + parentf.name;


        }
    }

}
