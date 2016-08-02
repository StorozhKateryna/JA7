package HomeWork.date160801;

import java.util.Scanner;

/**
 * Created by Игорь on 02.08.2016.
 */
public class Tar160801Ex1 {

    public static void main(String[] args) {
        triangle tr1 = new triangle();
        System.out.println("площа трикутника дорівнює: " + tr1.Area()+" періметр трикутника дорівнює: "+ tr1.Perimetr());
    }
}
 class triangle {
    int a;
    int b;
    int c;

    public triangle() {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введіть першу сторону трикутника: ");
            this.a=scanner.nextInt();
            System.out.println("Введіть другу сторону трикутника:");
            this.b=scanner.nextInt();
            System.out.println("Введіть третю сторону трикутника:");
            this.c=scanner.nextInt();
            if(c<(a+b)&&b<(c+a)&&a<(b+c)) break;
            System.out.println("Трикутника з такими параметрами не існує, введіть сторони трикутника ще раз.");
        }
    }

    public double Area(){
        // S = √р(р-а)(р-b)(p-c)
        return Math.sqrt(Perimetr()/2*(Perimetr()/2-a)*(Perimetr()/2-b)*(Perimetr()/2-c));
    }
    public int Perimetr(){
        return a+b+c;
    }

}
