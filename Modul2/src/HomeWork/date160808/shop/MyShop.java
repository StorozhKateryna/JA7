package HomeWork.date160808.shop;

import java.util.Arrays;
import java.util.Scanner;

public class MyShop {



    public static void main(String[] args) {
        Products[] products = new Products[4];
        products[0] = new Products("Кола", 10);
        products[1] = new Products("Бургер", 20);
        products[2] = new Products("Картошка", 15);
        products[3] = new Products("Морожено", 15);


        for (Products product : products) {
            System.out.println(product.getName() + " " + product.getPrise());

        }

        String[] zakaz = scanThezakaz();
        int count = zakaz.length;


        switch (count) {
            case 1:
                Products.sum(searchMenu(zakaz[0], products));
                break;
            case 2:
                Products.sum(searchMenu(zakaz[0],products), searchMenu(zakaz[1], products));
                break;
            case 3:
                Products.sum(searchMenu(zakaz[0],products), searchMenu(zakaz[1], products), searchMenu(zakaz[2], products));
                break;
            case 4:
                Products.sum(searchMenu(zakaz[0],products), searchMenu(zakaz[1], products), searchMenu(zakaz[2], products), searchMenu(zakaz[3], products));
                break;
            case 5:
                Products.sum(searchMenu(zakaz[0],products), searchMenu(zakaz[1], products), searchMenu(zakaz[2], products), searchMenu(zakaz[3], products), searchMenu(zakaz[4], products));
                break;
            case 6:
                Products.sum(searchMenu(zakaz[0],products), searchMenu(zakaz[1], products), searchMenu(zakaz[2], products), searchMenu(zakaz[3], products), searchMenu(zakaz[4], products), searchMenu(zakaz[5], products));
                break;
            case 7:
                Products.sum(searchMenu(zakaz[0],products), searchMenu(zakaz[1], products), searchMenu(zakaz[2], products), searchMenu(zakaz[3], products), searchMenu(zakaz[4], products), searchMenu(zakaz[5], products),searchMenu(zakaz[6], products));
                break;
            default:
                System.out.println("Вы ничего не заказали");
                break;
        }

        System.out.println("Ваш заказ"+Arrays.toString(zakaz));

    }


    public static Products searchMenu(String s, Products[] myProducts){

        double prise = 0;
        String menu = "";
        for (Products myProduct : myProducts) {
            if (s.equals(myProduct.getName())) {
                prise = myProduct.getPrise();
                menu = myProduct.getName();
            }
            else {
                //System.out.println(s + "? Простите, но такого нет в нашем меню");
            }

        }
        return new Products(menu, prise);
    }




    public static String[] scanThezakaz() {
        Scanner scanner = new Scanner(System.in);
        String[] zakaz;
        String fromScan = "";
        String lastScan = "";
        int i = 0;
        System.out.println("Что закажете?");
        System.out.println("Для подтверждения заказа нажмите *");

        while (!(lastScan.equals("* "))&&i<7){ // после exit добавлен пробел
            lastScan = scanner.nextLine() + " ";
            if (!(lastScan.equals("* "))) {
                fromScan+=lastScan;
            }
            i++;

        }
        zakaz = fromScan.split(" +");
        return zakaz;
    }

}
