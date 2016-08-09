package HomeWork.date160809.Tar160809Ex1;

/**
 * Created by Игорь on 09.08.2016.
 */
public class Teacher extends People {
    boolean isTeacher;

    public Teacher(String name, int age) {
        super(name, age);
        this.isTeacher = true;
    }
}