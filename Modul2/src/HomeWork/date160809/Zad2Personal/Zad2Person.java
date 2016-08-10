package Lesson160809.Zad2Personal;

/**
 * Created by Acer552 on 09.08.2016.
 */
/*2)Создать сотрудников: грузчик, кладовщик, водитель, менеджер,
 программист, руководитель отдела, директор.
 У каждого должны быть обязательные поля: имя, возраст,
 общий стаж работы, стаж работы в компании, должность.
 Разработать систему начисления заработной платы в зависимости от полей: возраст,
 общий стаж работы, стаж работы в компании, должность. Распечатать результат.*/
public class Zad2Person {
 private String name;
 private double age;
 private double obchijStaj;
 private double stajVKomp;
 private double doljnost;

 public Zad2Person(String name, double age, double obchijStaj, double stajVKomp,
                   double doljnost) {
  this.name = name;
  this.age = age;
  this.obchijStaj = obchijStaj;
  this.stajVKomp = stajVKomp;
  this.doljnost = doljnost;
 }

 public static double koeficientobchijStag(double obchijStaj) {
  if (obchijStaj > 10) {
   obchijStaj = 1.0;
  } else if (obchijStaj > 6) {
   obchijStaj = 0.5;
  } else if (obchijStaj > 3) {
   obchijStaj = 0.3;
  }
  return obchijStaj;
 }

 public static double koeficientStagVKomp(double stajVKomp) {
  if (stajVKomp > 6) {
   stajVKomp = 3.0;
  } else if (stajVKomp > 4) {
   stajVKomp = 2.0;
  } else if (stajVKomp > 2) {
   stajVKomp = 1.0;
  }
  return stajVKomp;
 }

 public static double koeficientDolgnost(double doljnost) {
  if (doljnost > 4) {
   doljnost = 4.0;
  } else if (doljnost > 3) {
   doljnost = 3.0;
  } else if (doljnost > 2) {
   doljnost = 2.0;
  } else if (doljnost > 1) {
   doljnost = 1.0;
  }
  return doljnost;
 }

 //public static double Zarplata() {
 }
