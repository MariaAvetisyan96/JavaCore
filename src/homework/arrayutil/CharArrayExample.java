package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
        //1 find the char c and print the amount
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';


        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {

            }
        }
        int numchar = 0;
        numchar = chars.length;
        numchar++;


        System.out.println(numchar);


//2 print the chars that in the middle of the array
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char a = 'a';
        char l = 'l';
        for (int j = 0; j < chars2.length; j++) {
            if (a == chars2[j]) {

            }
            if (l == chars2[j]) {
            }
        }
        System.out.print(a + " ");
        System.out.print(l + " ");
        //3 print true if the array ends in -ly, if not print false.
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        boolean b = false;
        b = true;
        for (int k = 0; k < chars3.length; k++) {
            if ('l' == chars3[k]) {

            }
            if ('y' == chars3[k]) {

            }
        }

        System.out.println();
        System.out.print(b);
        //4 print true if the text contains the word "bob"
        char[] bobArray = {'b', 'a', 'b', 'o', 'l', 'a'};

        for (int p = 0; p < bobArray.length; p++) {
            if (bobArray[p] != 'b' + 'o' + 'b') ;
        }
        System.out.println();
        System.out.println(false);


// 5 print the chars that don't contain ''
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        char textb = 'b';
        char texta = 'a';
        char textr = 'e';
        char texte = 'e';
        char textv = 'v';

        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i]);

        }


    }


}














