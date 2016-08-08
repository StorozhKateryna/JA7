package HomeWork.date160808.Tar160808Ex1;

import java.util.Scanner;

/**
 * Created by Игорь on 08.08.2016.
 */
public class Zamovlennya {
    int colaCost = 10;
    int burgerCost = 10;
    int potatoFreeCost = 10;
    int burger = 0;
    int cola = 0;
    int potatoFree = 0;
    int sum;


    public Zamovlennya() {
        System.out.println("Введіть кількість замовленних бургерів (0 або Enter, якщо жодного):");
        this.burger = scanQuantity();
        System.out.println("Введіть кількість замовленної коли (0 або Enter, якщо жодної):");
        this.cola = scanQuantity();
        System.out.println("Введіть кількість замовленнщї картоплі фрі (0 або Enter, якщо жодної):");
        this.potatoFree = scanQuantity();
        this.sum = cola * colaCost + burger * burgerCost + potatoFree * potatoFreeCost;
    }

    int scanQuantity() {
        while (true) {
            Scanner scan = new Scanner(System.in);
            String scanStr = scan.nextLine();
            if (scanStr.length() > 0  ) {
                if(Character.isDigit(scanStr.charAt(0))&& scanStr.length() < 3)return Integer.parseInt(scanStr);
            } else return 0;
            System.out.println("Помилка вводу або занадто велике число, введіть ще раз");
        }
    }

    public void print() {
        System.out.print("Ваше замовлення: ");
        if(burger>0)System.out.print("Бургер: "+burger+"  ");
        if(cola>0)System.out.print("Кола: "+cola+"  ");
        if(potatoFree>0)System.out.print("Картопля фрі: "+potatoFree);
        System.out.println(", Сумма заказу: "+sum);
    }
}
