package Lesson160809.Zad2Personal;

/**
 * Created by Acer552 on 09.08.2016.
 */
public class rukovoditelOtd extends Zad2Person {
private String rukovoditOtdelom;

    public rukovoditelOtd(String name, double age, double obchijStaj, double stajVKomp,
                          double doljnost, String rukovoditOtdelom) {
        super(name, age, obchijStaj, stajVKomp, doljnost);
        this.rukovoditOtdelom = rukovoditOtdelom;
    }
}
