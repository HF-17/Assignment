package tasks.OOP.Student_Grade_System;

public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone No: " + this.mpno);
        System.out.println("Branch: " + this.branch);
    }
}
