package HomeWork.date160802;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Игорь on 02.08.2016.
 */
public class Tar160802Ex1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("d MM yyyy");
        System.out.println("Введіть дату у форматі число місяць рік(4цифри)");
        String str = scan.nextLine();
        Date dateNow = new Date();
        Date dateImput;
        try{
            dateImput = sdf.parse(str);
            int sw = dateImput.compareTo(dateNow);
            switch (sw){
                case -1:
                    System.out.println("Введена дата більш рання відносно зараз");
                    break;
                case 1:
                    System.out.println("Введена дата більш пізня відносно зараз");
                    break;
                case 0:
                    System.out.println("Дати тотожні ");
                    break;
            }
            if(dateImput.getYear()!=dateNow.getYear()) System.out.println("Роки - введений: "+(dateImput.getYear()+1900)+" зараз: "+(dateNow.getYear()+1900));
            if(dateImput.getYear()!=dateNow.getYear()) System.out.println("Місяці - введений: "+(dateImput.getMonth()+1)+" зараз: "+(dateNow.getMonth()+1));
        }
        catch (ParseException e){
            System.out.println("Wrong input");
        }

    }

}
