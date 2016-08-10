package Lesson160809.Zad2Personal;

/**
 * Created by Acer552 on 09.08.2016.
 */
public class menager extends Zad2Person {

    private String makeMenagement;

    public menager(String name, double age, double obchijStaj, double stajVKomp,
                   double doljnost, String makeMenagement) {
        super(name, age, obchijStaj, stajVKomp, doljnost);
        this.makeMenagement = makeMenagement;
    }
}
