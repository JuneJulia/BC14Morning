package day7;

public class HelloBoolean {
    public static void main(String[] args) {
        //introductionBoolean ();
        boolean a = true;
        boolean b, c;
        b = false;
        c = a & b;
        System.out.println("a & b:" + c);
        c = a | b;
        System.out.println("a | b: " + c);
        c = a ^ b;
        System.out.println("a ^ b: " + c);
        c = a!= b;
        System.out.println("a! = b: " + c);


    }
}
