package homework.chapters.chapter3part2;

public class FigurePainter {
    public static void main(String[] args) {
        //figure 1
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();

        }
        System.out.println();
//Figure 2
        for (int i = 0; i <5; i++) {
            for (int j = 4; j >i; j--) {
                System.out.print("  ");
            }

            for (int j = 0; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // Figure 3
        System.out.println();
        for (int i = 5; i > 0;i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }}

 }


