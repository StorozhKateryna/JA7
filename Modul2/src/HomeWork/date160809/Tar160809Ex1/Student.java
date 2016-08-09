package HomeWork.date160809.Tar160809Ex1;

/**
 * Created by Игорь on 09.08.2016.
 */
public class Student extends People{
    boolean isStudent;

    public Student(String name, int age) {
        super(name, age);
        this.isStudent = true;
    }
}
