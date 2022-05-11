package homework.chapters.chapter3part2;

public class NewTriangle {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*  "+ "");
            }
            System.out.println();
        }

        //figure2
        for (int k = 0; k <= 5; k++) {
            for (int l = k; l <= k; l++) {
                System.out.print(" " + "*" );
            }
            for (int l = 1; l < k; l++) {
                System.out.print(" "+ " *");
            }
            System.out.println();}

            // figure 3
        int n = 5;

            for (int i = 1; i <= n; i++) {
                for (int j = i; j <= n; j++) {
                    System.out.print("  *");

                }
                System.out.println();

            }


        }
    }

