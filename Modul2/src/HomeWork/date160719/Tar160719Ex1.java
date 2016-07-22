package HomeWork.date160719;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by Игорь on 19.07.2016.
 */
public class Tar160719Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите высоту прямоугольника:");
        int hight = scan.nextInt();
        System.out.print("Введите ширину прямоугольника:");
        int wight = scan.nextInt();
        char ch = ' ';
        if (wight > 0) {
            for (int i = 1; i <= hight; i++) {
                if (i == 1 || i == hight) ch = '*';
                else ch = ' ';
                if (wight > 1) System.out.print('*');
                for (int j = 0; j < wight - 2; j++) {
                    System.out.print(ch);
                }
                System.out.print("*\n");
            }
        }

    }
}

