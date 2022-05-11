package homework.chapters.chapter3part2;

public class ArrayExample2 {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        numbers[0]=85;
        numbers[3]=53;
        System.out.println("numers [0] = " + numbers[0]);
        System.out.println("numers [3 ] = " + numbers[3]);
        System.out.println("numers [6 ] = " + numbers[6]);
        System.out.println("numers [10] = " + numbers[10]);
        System.out.println("numers [4] = " + numbers[4]);
        System.out.println(numbers.length);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");

        }

    }
}
