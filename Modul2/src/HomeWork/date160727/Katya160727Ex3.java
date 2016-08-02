package HomeWork.date160727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Дано натуральное число n.( Число вводим с клавиатуры) Выведите все числа от 1 до n. (Используя рекурсию)
 */
public class Katya160727Ex3 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(buffer.readLine());
        System.out.println(recursion(num)); // вызов рекурсивной функции
    }

    public static String recursion(int i) {
        if (i==1) {
            return "1";
        }
        else
            return recursion(i-1) + " " + i;
    }
}
