package HomeWork.date160726;

import java.util.Random;

/**
 * Created by Игорь on 26.07.2016.
 */
public class Tar160726Ex1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] arr = new  int[10000];
        int sum=0;
        int count = 0;
        System.out.print("Елементи масиву, що діляться на 13.5 без залишку:\n\t");
        for (int i = 0; i<arr.length; i++) {
            arr[i] = rnd.nextInt(1000);
            if ((double)arr[i]%13.5==0&&arr[i]!=0) {
                System.out.print(arr[i]+"\t");
                sum+=arr[i];
                count++;
                if (count%20==0) System.out.print("\n\t");//для зручності перегляду
            }
            }
        System.out.println("\nСумма цих елементів: " + sum);

        }


    }

