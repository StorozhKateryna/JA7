package HomeWork.date160727;

/**
 * Created by Игорь on 27.07.2016.
 */
/**
 *Написать метод который сравнит срок окупаемости в км , автомобиля Tesla model S,
 *Nissan Leaf с другим бензиновым автомобилем стоимость которого в 2-а раза дешевле Tesla.
 */
public class Tar160727Ex2 {
    public static void main(String[] args) {
        int VehicleCost = 157500000;//половина вартості тесли в Україні :(
       costBack(VehicleCost);

    }
    static void costBack(int VehicleCost){
        int fuelCost = 2300;
        int kwtCost = 99;
        double kwtConsumption = 0.2;
        double fuelConsumption = 0.06;
        double costBack= VehicleCost/(fuelCost*fuelConsumption-kwtCost*kwtConsumption);
        System.out.println("Термін окупності Тесли в км: " + Math.round(costBack));
    }
}
