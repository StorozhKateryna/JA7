package date160727;

/**
 * Создайте программу, которая будет генерировать и выводить на экран вещественное псевдослучайное число из промежутка [-3;3).
 */
public class PasEx4 {
    public static void main(String[] args) {
        float a=(float)Math.random()*6-3;
        System.out.println("Случайное число из отрезка -3,3 равно " +a);
    }
}


// int a = (int) Math.random();
        //System.out.println((int) (Math.random()*7)-3);



