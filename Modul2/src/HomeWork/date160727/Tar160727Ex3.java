package HomeWork.date160727;

/**
 * Created by Игорь on 27.07.2016.
 */

import java.util.Scanner;

/**
 * Дано натуральное число n.( Число вводим с клавиатуры) Выведите все числа от 1 до n. (Используя рекурсию)
 */
public class Tar160727Ex3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть число: ");
        int number = scan.nextInt();
        increase(number,1);
    }
    public static void increase(int number,int count) {
        System.out.println(count);
        if (count<number)  increase(number,count+1);
    }
}
