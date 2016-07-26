package homework.data160726;

import java.util.Random;

/**
 * Создать массив, на 10000 значений, числа от 0 до 1000, нужно отобрать из них те которые делятся без
 * остатка на 13.5 вывести их на печать и посчитать сумму.
 * 1) создать массив 10000
 * 2) наполнить массив числами от 0 до 1000
 * 3) вывести на печать числа делятся без остатка на 13.5
 * 4) посчитать сумму
 */
public class ReshEx1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mas = new int[10000];
        int sum = 0;
        int count = 0;
        System.out.println("Элементи масива, которые делятся на 13.50 без остатка:\t");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(1000);
            if ((double) mas[i] % 13.5 == 0 && mas[i] != 0) {
                System.out.println(mas[i] + "\t");
                sum += mas[i];
                count++;
            }
        }
        System.out.println();
        System.out.println("Сумма элементов: " + sum);

    }
}
