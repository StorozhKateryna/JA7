package Lesson160809.Zad2Personal;

/**
 * Created by Acer552 on 09.08.2016.
 */
public class kladovchik extends Zad2Person {
    private String kladetNaVse;

    public kladovchik(String name, double age, double obchijStaj, double stajVKomp,
                      double doljnost, String kladetNaVse) {
        super(name, age, obchijStaj, stajVKomp, doljnost);
        this.kladetNaVse = kladetNaVse;
    }
}
