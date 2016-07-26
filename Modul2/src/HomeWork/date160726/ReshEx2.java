package homework.data160726;

import java.util.Scanner;

/**
 * Написать метод параметрами которого является длинна и ширина прямоугольника. Метод должен
 * нарисовать с помощью символов «*» этот прямоугольник в консоли.
 */
public class ReshEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Высота");
        int n = sc.nextInt();
        System.out.println("Ширина");
        int m = sc.nextInt();
        met(n, m);
    }

    static void met(int n, int m) {
        for (int i = 0; i < n; i++) {
            if (i <= i + 1)
                System.out.print(" ");
            for (int j = 0; j < m - 1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

    }
}
