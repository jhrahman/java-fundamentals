package day8;

public class StringComparisons {
    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = "Welcome";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));


        String s3 = new String("Jahid"); // new String creates the objects
        String s4 = new String("Jahid");

        System.out.println(s3==s4); //compares the objects
        System.out.println(s3.equals(s4)); //compares the values of the objects
    }
}
