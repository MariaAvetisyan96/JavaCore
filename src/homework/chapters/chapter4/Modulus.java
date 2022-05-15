package homework.chapters.chapter4;

public class Modulus {
    public static void main(String[] args) {
        //Demonstrate the % operator
        //Modulus
        int x = 42;
        double y = 42.25;
        System.out.println("X mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);
        // Demonstrate several assignment operators-Op Equals
        System.out.println();
        int a = 1;
        int b = 2;
        int c = 3;
        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        System.out.println("a =" + a);
        System.out.println("b =" + b);
        System.out.println("c =" + c);

    }
}
