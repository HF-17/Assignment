package tasks.OOP.Student_Grade_System;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage1;
    double avarage2;
    double avarage3;
    boolean isPass;

    Student(String name, String stuNo, String classes,Course c1, Course c2,Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage1 = 0.00;
        this.avarage2 = 0.00;
        this.avarage3 = 0.00;
        this.isPass = false;
    }
     void addBulkExamNote(int note1,int note2, int note3) {
         if (note1 >= 0 && note1 <= 100) {
             this.c1.note = note1;
         }
         if (note2 >= 0 && note2 <= 100) {
             this.c2.note = note2;
         }
         if (note3 >= 0 && note3 <= 100) {
             this.c3.note = note3;
         }
     }

     void addSozluNote(int sozlu1,int sozlu2,int sozlu3) {
         if (sozlu1 >= 0 && sozlu1 <= 100) {
             this.c1.sozlu = sozlu1;
         }
         if (sozlu2 >= 0 && sozlu2 <= 100) {
             this.c2.sozlu = sozlu2;
         }
         if (sozlu3 >= 0 && sozlu3 <= 100) {
             this.c3.sozlu = sozlu3;
         }
     }

     void calcAvarange() {
         this.avarage1 = (this.c1.note*0.80 + this.c1.sozlu*0.20) / 2.0;
         this.avarage2 = (this.c2.note*0.80 + this.c2.sozlu*0.20) / 2.0;
         this.avarage3 = (this.c3.note*0.80 + this.c3.sozlu*0.20) / 2.0;
     }

     void isPass() {
        calcAvarange();
        if (this.avarage1 > 30 || this.avarage2 > 30 || this.avarage3 > 30) {
            printNote();
            System.out.println("Sınıfı Gectiniz");
        }else {
            System.out.println("Sınıfta  kalıdnız!");
        }
     }

     void printNote() {
         System.out.println(this.c1.name + " note\t:" + this.avarage1);
         System.out.println(this.c2.name + " note\t:" + this.avarage2);
         System.out.println(this.c3.name + " note\t:" + this.avarage3);
     }
}
