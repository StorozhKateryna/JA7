package HomeWork.date160715;

/**
 * Created by Игорь on 17.07.2016.
 */
public class TarEx1 {
    public static void main(String[] args) {
        String str = "Мне нравится Джава, поэтому кроме домашних заданий я читаю книги по Джава и смотрю уроки по Джава !";
        System.out.println(str);
       StringBuilder sb = new StringBuilder(str);
        int index = sb.indexOf("Джава");
        while (index != -1){
        sb.delete(index,index+5);
        sb.insert(index,"Java");
            index = sb.indexOf("Джава", index);
        }
        System.out.println(sb);


    }
}
