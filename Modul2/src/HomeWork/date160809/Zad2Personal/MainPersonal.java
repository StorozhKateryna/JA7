package Lesson160809.Zad2Personal;

/**
 * Created by Acer552 on 09.08.2016.
 *//*Создать сотрудников: грузчик, кладовщик, водитель,
        менеджер, программист, руководитель отдела, директор.
        У каждого должны быть обязательные поля: имя, возраст,
        общий стаж работы, стаж работы в компании, должность.
        Разработать систему начисления заработной платы в зависимости от полей:
        возраст, общий стаж работы,
        стаж работы в компании, должность. Распечатать результат.*/
public class MainPersonal {
    public static void main(String[] args) {
        String q="gruzchik= index zarplata 1" ;
        String q1="kladovchik ,voditel = index zarplata 2";
        String q3="menager, rukovoditelOtd = index zarplata 3";
        String q4 ="programer = index zarplata 4";

        int obchStavka= 1000;

        String gruzchikName= "Vasil";
        double gruzchikAge= 30;
        double gruzchikStajeObch= 10;
        double getGruzchikStajeComp= 5;
        double gruzchikDolj=1;
        gruzchik gruz= new gruzchik(gruzchikName,gruzchikAge,gruzchikStajeObch,getGruzchikStajeComp,gruzchikDolj,"gruzit");

        String kladovchikName= "Dementij";
        double kladovchikAge=45;
        double kladovchikStajeObch= 30;
        double kladovchikStajeComp= 10;
        double kladovchikDolj=2;
        kladovchik klad = new kladovchik(kladovchikName,kladovchikAge,kladovchikStajeObch,kladovchikStajeComp,kladovchikDolj,"kladet");

        String voditelName= "Petrovich";
        double voditelAge=60;
        double voditelStajeObch= 30;
        double voditelStajeComp= 1;
        double voditelDolj=1;
        voditel vodit=new voditel(voditelName,voditelAge,voditelStajeObch,voditelStajeComp,voditelDolj," vozit");

        String menagerName= "Pavlo";
        double menagerAge=18;
        double menagerStajeObch= 1;
        double menagerStajeComp= 1;
        double menagerDolj=3;
        menager menag= new menager(menagerName,menagerAge,menagerStajeObch,menagerStajeComp,menagerDolj,"menagit");

        String rukovoditelOtdName= "Dementij";
        double rukovoditelOtdAge=40;
        double rukovoditelOtdStajeObch= 20;
        double rukovoditelOtdStajeComp= 10;
        double rukovoditelOtdDolj=3;
        rukovoditelOtd rukovod= new rukovoditelOtd(rukovoditelOtdName,rukovoditelOtdAge,rukovoditelOtdStajeObch,rukovoditelOtdStajeObch,rukovoditelOtdDolj,"rukovodit");

        String programerName= "Stiv";
        double programerAge=29;
        double programerStajeObch= 9;
        double programerStajeComp= 3;
        double programerDolj=4;
        programer programer=new programer(programerName,programerAge,programerStajeObch,programerStajeComp,programerDolj,"programiruet");


        double ZPgruzchik=obchStavka*(gruz.koeficientobchijStag(gruzchikStajeObch)+gruz.koeficientStagVKomp(getGruzchikStajeComp)+gruz.koeficientDolgnost(gruzchikDolj));
        System.out.println("Зарплата гружчика " + ZPgruzchik);

        double ZPgkladovchic=obchStavka*(klad.koeficientobchijStag(kladovchikStajeObch)+klad.koeficientStagVKomp(kladovchikStajeComp)+klad.koeficientDolgnost(kladovchikDolj));
        System.out.println("Зарплата кладовщика "+ ZPgkladovchic);

        double ZPvoditelja=obchStavka*(vodit.koeficientobchijStag(voditelStajeObch)+vodit.koeficientStagVKomp(voditelStajeComp)+vodit.koeficientDolgnost(voditelDolj));
        System.out.println("Зарплата водителя "+ZPvoditelja);

        double ZPmenadjera=obchStavka*(menag.koeficientobchijStag(voditelStajeObch)+menag.koeficientStagVKomp(menagerStajeComp)+menag.koeficientDolgnost(menagerDolj));
        System.out.println("Зарплата менаджера " +ZPmenadjera);

        double ZPrukovoditelja=obchStavka*(rukovod.koeficientobchijStag(rukovoditelOtdStajeObch)+rukovod.koeficientStagVKomp(rukovoditelOtdStajeComp)+rukovod.koeficientDolgnost(rukovoditelOtdDolj));
        System.out.println("Зарплата руководителя " + ZPrukovoditelja);

        double ZPprogramer=obchStavka*(programer.koeficientobchijStag(programerStajeObch)+programer.koeficientStagVKomp(programerStajeComp)+programer.koeficientDolgnost(programerDolj));
        System.out.println("Зарплата програмиста "+ZPgkladovchic);



        //double ZP= gruz.koeficientobchijStag(gruzchikStajeObch);
    }
}
