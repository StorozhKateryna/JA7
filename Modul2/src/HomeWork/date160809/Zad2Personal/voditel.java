package Lesson160809.Zad2Personal;

/**
 * Created by Acer552 on 09.08.2016.
 */
public class voditel extends Zad2Person {
    private String vozitVsex;

    public voditel(String name, double age, double obchijStaj, double stajVKomp,
                   double doljnost, String vozitVsex) {
        super(name, age, obchijStaj, stajVKomp, doljnost);
        this.vozitVsex = vozitVsex;
    }
}
