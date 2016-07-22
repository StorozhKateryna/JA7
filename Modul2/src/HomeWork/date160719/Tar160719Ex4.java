package HomeWork.date160719;

/**
 * Created by Игорь on 19.07.2016.
 */
public class TarEx4 {
    public static void main(String[] args) {
        System.out.print("Таблица Пифагора:" +
                "\n\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\n");
        for (int i = 1; i <11; i++) {
            System.out.print(i +"\t");
            for (int j = 1; j <11 ; j++) {
                System.out.print(i*j);
                System.out.print("\t");
            }
            System.out.print("\n");
        }


        }
    }

