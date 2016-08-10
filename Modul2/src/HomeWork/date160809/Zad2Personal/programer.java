package Lesson160809.Zad2Personal;

/**
 * Created by Acer552 on 09.08.2016.
 */
public class programer extends Zad2Person {
    private String toPrograming;

    public programer(String name, double age, double obchijStaj, double stajVKomp,
                     double doljnost, String toPrograming) {
        super(name, age, obchijStaj, stajVKomp, doljnost);
        this.toPrograming = toPrograming;
    }
}
