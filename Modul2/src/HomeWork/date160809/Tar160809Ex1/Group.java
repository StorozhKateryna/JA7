package HomeWork.date160809.Tar160809Ex1;

import java.util.Arrays;

/**
 * Created by Игорь on 09.08.2016.
 */
public class Group {
    String name;
    Teacher curator;
    Student [] students;

    public Group(String name, Teacher curator, Student[] students) {
        this.name = name;
        this.curator = curator;
        this.students = students;
    }
    public Group(String name, Teacher curator) {
        this.name = name;
        this.curator = curator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getCurator() {
        return curator;
    }

    public void setCurator(Teacher curator) {
        this.curator = curator;
    }

    public void delStudentByName(String name){
        int count=0;
        for (int i = 0; i <students.length ; i++) {
            if(students[i].getName().equalsIgnoreCase(name)){
                students[i].setName("");
                count++;
            }
        }
        if(count>0){
            Student[] students2=new Student[students.length-count];
            int j=0;
            for (int i = 0; i <students.length ; i++) {
                if(students[i].getName()!="") {
                    students2[j]=students[i];
                    j++;}
            }
            students=students2;
        } else System.out.println("Таке ім'я не знайдене");
    }
    public void delStudentByNumber(int number){
        int index=-1;
        if(number>0&&number<=students.length) {
            index = number - 1;
            students[index].setName("");
            Student[] students2 = new Student[students.length - 1];
            int j = 0;
            for (int i = 0; i < students.length; i++) {
                if (students[i].getName() != "") {
                    students2[j] = students[i];
                    j++;
                }
            }
            students = students2;
        } else System.out.println("Такого номеру не існує");
    }
    public void addStudent(Student student){
        students= Arrays.copyOf(students,students.length+1);
        students[students.length-1]=student;
    }
    public  void print(){
        System.out.println("Назва группи: "+name);
        System.out.println("Викладач: "+curator.getName());
        System.out.println("Студенти:\n№\t Ім'я  \tВік");
        for (int i = 0; i <students.length ; i++) {
            System.out.print((i+1)+"\t");
            students[i].print();
        }
    }
}

