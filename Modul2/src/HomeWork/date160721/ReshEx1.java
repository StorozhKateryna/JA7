package homework.data160721;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Есть строка «АА1458АВ». Вытянуть из нее в разные переменные текст (2-е переменные) и цифры (1-на
 * переменная).
 * нам не известно сколько символов текстовых и сколько цифр (например: «тел.:234-59-02, тел.моб.: +38 067
 * 333 33 33»), нужно что бы текст был в одной переменной, а цифры во второй, если после цифр идет опять текст
 * он также вносится в свою переменную и т.д
 */
public class ReshEx1 {
    public static void main(String[] args) {
//        // create 2 char primitives ch1, ch2
//        char ch1, ch2;
//
//        // assign values to ch1, ch2
//        ch1 = 'A';
//        ch2 = '9';
//
//        // create 2 boolean primitives b1, b2
//        boolean b1, b2;
//
//        // check if ch1, ch2 are letter or not and assign results to b1, b2
//        b1 = Character.isLetter(ch1);
//        b2 = Character.isLetter(ch2);
//
//        String str1 = ch1 + " is a letter is " + b1;
//        String str2 = ch2 + " is a letter is " + b2;
//
//        // print b1, b2 values
//        System.out.println( str1 );
//        System.out.println( str2 );
        String str = "АА1458АВ";
        int[] ch = new int[8];
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                ch[i] = str.charAt(i);
                System.out.println(str.charAt(i));
            }
            if (Character.isDigit(str.charAt(i))) {
                System.out.println(str.charAt(i));
            }

        }
        System.out.println(Arrays.toString(ch));

    }
}
