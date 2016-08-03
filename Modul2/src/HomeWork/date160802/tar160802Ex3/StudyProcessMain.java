package HomeWork.date160802.tar160802Ex3;

import java.util.Random;

/**
 * Created by Игорь on 03.08.2016.
 */
public class StudyProcessMain {
    public static void main(String[] args) {
        Subject[] subjects = {new Subject("Anatomy"),new Subject("Physiology"),new Subject("Statistic")};
        Student[] students = {new Student("Billy"),new Student("Bobby"),new Student("Harry"),new Student("Katy")};
        Random rnd = new Random();
        for (int i = 0; i < 5; i++) {
            System.out.println("Студент "+students[rnd.nextInt(4)].name+
                    " вивчав тему №"+(rnd.nextInt(100)+1)+" курсу "+subjects[rnd.nextInt(3)].name+
                    " і викладач йому поставив  "+(rnd.nextInt(4)+2)+" балів за знання");
        }
    }

}
