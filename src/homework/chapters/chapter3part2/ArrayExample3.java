package homework.chapters.chapter3part2;

public class ArrayExample3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println(numbers[numbers.length / 2 + 1]);
        System.out.println("\"middle number + 1  in the line is  \"" + " " + numbers[numbers.length / 2 + 1]);


    }
}

