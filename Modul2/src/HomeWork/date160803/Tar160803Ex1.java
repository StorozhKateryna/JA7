package HomeWork.date160803;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by Игорь on 08.08.2016.
 */
public class Tar160803Ex1 {
    public static void main(String[] args) {

        Airport[] airports = {
                new Airport("Бориспіль","Київ","Україна"),
                new Airport("Жуляни","Київ","Україна"),
                new Airport("Львів","Львів","Україна"),
                new Airport("Хитроу","Лондон","Англія"),
                new Airport("Ешворд","Лондон","Англія"),
                new Airport("Ататюрк","Стамбул","Турция"),
                new Airport("Саутенд","Лондон","Англія"),
                new Airport("Біггін_Хілл","Лондон","Англія"),
                new Airport("Даллес","Вашингтон","США"),
                new Airport("Гатвік","Лондон","Англія")
        };
        System.out.println("Введіть частину назви міста для виводу відповідних аеропортів:");
        Scanner scan = new Scanner(System.in);
        boolean chek = true;
        String city1=scan.nextLine();
        long date1 = new Date().getTime();
        for (Airport airport : airports) {
            if(airport.city.toLowerCase().indexOf(city1)!=-1){
                if(chek){
                    System.out.print("В місті " + airport.city +" присутні наступні аеропорти: ");
                    chek=false;
                }
                System.out.print(airport.name+" ");
            }
        }
        if(chek) System.out.println("Такого міста не знайдено");
        System.out.println("\nНа виконання пошуку пішло " + (new Date().getTime()-date1)+"мс");

    }


}
class Airport{
    public String name;
    public String city;
    public String counry;

    public Airport(String name, String city, String counry) {
        this.name = name;
        this.city = city;
        this.counry = counry;
    }
}
