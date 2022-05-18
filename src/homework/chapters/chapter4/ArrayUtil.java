package homework.chapters.chapter4;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        System.out.print(" \"all the numbers:\"");
        for (int i = 0; i < array.length; i++) {
            System.out.print(+array[i] + " ");

        }
        System.out.println();
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println();
        System.out.println(" \"The largest number is\":" + max);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println();
        System.out.println(" \"The smallest number is\":" + min);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(" " + array[i]);

            }
        }
        System.out.println(" " + "All the even numbers");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(" " + array[i]);

            }
        }
        System.out.println(" " + "All the odd numbers");
        int countofeven = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countofeven++;

            }

        }
        System.out.println(" the amount of the even numbers" + " " + countofeven);

        int countofodd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countofodd++;

            }

        }
        System.out.println(" the amount of the odd numbers" + " " + countofodd);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.println("The whole sum of the numbers is "+" "+ sum);

        double av = 0;
        for (int i = 0; i < array.length; i++) {
           sum+= array[i];

        }

        double avg= sum/array.length;
        System.out.println("The avarage double number is "+ avg);
    }
}









