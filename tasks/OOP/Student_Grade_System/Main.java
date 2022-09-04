package tasks.OOP.Student_Grade_System;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Halil Hoca", "555", "TRH");
        Teacher t2 = new Teacher("Graham Bell", "0000", "FZK");
        Teacher t3 = new Teacher("Külyutmaz", "0007", "BIO");


        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);
        Course bioloji = new Course("Bioloji", "103", "BIO");
        bioloji.addTeacher(t3);


        Student s1 = new Student("Inek Şaban", "321", "12/A", tarih, fizik, bioloji);
        s1.addBulkExamNote(100,75,82);
        s1.addSozluNote(80,70,75);
        s1.isPass();

    }
}
