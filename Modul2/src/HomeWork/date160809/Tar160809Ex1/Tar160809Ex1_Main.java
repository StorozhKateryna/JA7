package HomeWork.date160809.Tar160809Ex1;

/**
 * Created by Игорь on 09.08.2016.
 */
public class Tar160809Ex1_Main {
    public static void main(String[] args) {
        Student[] students= {new Student("Billy",19),
                new Student("Jonny",18),
                new Student("Bobby",17),
                new Student("Harry",25),
        };
        Teacher teacher=new Teacher("Катерина",16);
        Group ja8=new Group("JA8",teacher,students);//створюємо групу, передаємо викладача та студентів
        ja8.print();//роздруковуємо группу
        ja8.delStudentByNumber(1);//видаляємо студентів
        ja8.delStudentByName("bobby");
        ja8.addStudent(new Student("Jimmy",20));//додаємо нового студента
        ja8.setName("JA8*");//змінюємо назву группи
        ja8.curator.setName("Катерина");//виправляємо ім'я викладача
        ja8.print();//роздруковуємо группу ще раз

    }
}
