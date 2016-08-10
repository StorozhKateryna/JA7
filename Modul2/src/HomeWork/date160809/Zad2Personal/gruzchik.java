package Lesson160809.Zad2Personal;

/**
 * Created by Acer552 on 09.08.2016.
 */
public class gruzchik extends Zad2Person {
    private String gruzitTiadjest;

    public gruzchik(String name, double age, double obchijStaj, double stajVKomp,
                    double doljnost, String gruzitTiadjest) {
        super(name, age, obchijStaj, stajVKomp, doljnost);
        this.gruzitTiadjest = gruzitTiadjest;
    }
}
