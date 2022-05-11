package homework.chapters.chapter2;

public class JustExample {
    public static void main(String[] args) {
        int x, y;
        x = 50;
        y = 70;
        if (x < y) System.out.println("x is less than y");

        x = x * 3;
        if (x > y) System.out.println("x is greater than y");
        x = x + 10;
        if (x == y) System.out.println("It is now bypassed");

    }
}
