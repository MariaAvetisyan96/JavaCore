package homework.chapters.chapter2;

public class For {
    /* Demonstrate the for loop
    Call this file "ForTest.java"
     */
    public static void main(String[] args) {
        int x;
        for (x = 10; x > 0; x = x - 1) {
            System.out.println("This is x: " + x);

        }

        for (x = 0; x < 10; x = x + 1)
            System.out.println("This is x: " + x);

        for (int i = 0; i < 15; i++) {
            int m = i + 1;
            System.out.println(m + " ");


        }
    }

}
