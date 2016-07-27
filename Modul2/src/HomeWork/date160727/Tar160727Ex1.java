package HomeWork.date160727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Игорь on 27.07.2016.
 */
//**
//        * Написать метод который считает расход бензина 2-х автомобилей, учитывая расстояние,
//        * скорость (при скорости до 85 км/час – коеф расхода 1.1, 86-95 – 1.0, больше 96 – 1.2) и объем двигателя.
//        * Автомобиль движется 15км со скорость 65, потом скорость увеличивается на 20км/час и так автомобиль едет
//        * еще 25 минут, после чего подымает скорость еще на 30 км/час и проезжает 15 км., после чего каждые 5 минут
//        * сбрасывает скорость на 5 км/час до нуля
//        */
public class Tar160727Ex1 {
    public static void main(String[] args) throws IOException {
        double fd=fuelDrop();
        System.out.println("Витрата пального на маршруті становитиме: " +
                Double.toString(fd).substring(0,Double.toString(fd).indexOf('.')+2) + "л");

    }
    static double fuelDrop () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введіть об'єм двигуна у см^2 від 800 до 6000:");
        String eVolumeStr = br.readLine();
        int eVolume = Integer.parseInt(eVolumeStr);
        double vp=0;
        if (eVolume>2999&&eVolume<6001) vp=0.12;
        else if (eVolume>1600&&eVolume<6001) vp=0.08;
        else if (eVolume>1200&&eVolume<6001) vp=0.07;
        else if (eVolume>799&&eVolume<6001) vp=0.06;
        else {
            System.out.println("Об'єм двигуна введений невірно.");
         return fuelDrop();
        }
        double vpm = vp*15*1.1 + vp*15*1.2+vp*distance(85,25);
        for (double speed = 125; speed >0 ; speed-=5) {
            vpm += vp*distance(speed,5);
        }
        return vpm;
    }
    static double distance (double speed, int time ){
        if (speed<85) return speed/60*time*1.1;
        else if (speed>96) return speed/60*time*1.2;
        else   return speed/60*time;
    }
}
