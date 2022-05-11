package homework.chapters.chapter3part2;

public class ArrayExample4 {
    public static void main(String[] args) {
        int[] numbers = new int[1000];
        for (int i = 0; i < 1000; i++) {
            int x = i + 1;
            numbers[i] = x;

        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
    }
}
