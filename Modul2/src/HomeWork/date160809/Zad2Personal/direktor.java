package Lesson160809.Zad2Personal;

/**
 * Created by Acer552 on 09.08.2016.
 */
public class direktor extends Zad2Person {
    private String soxranjat;

    public direktor(String name, double age, double obchijStaj, double stajVKomp,
                    double doljnost, String soxranjat) {
        super(name, age, obchijStaj, stajVKomp, doljnost);
        this.soxranjat = soxranjat;
    }
}
