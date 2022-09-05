package tasks.OOP.Salary_Calculator;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;
    int tax;
    int bonus;
    int raise;
    int bonus_tax;
    int total;



    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

        tax();
        bonus();
        raiseSalary();
        this.bonus_tax = this.salary + this.bonus - this.tax;
        this.total = this.bonus_tax + this.raise;
        toPrint();
    }

    void tax() {
        if (this.salary > 1000) {
            this.tax = (this.salary*3) / 100;
        }else {
            this.tax = 0;
        }
    }

    void bonus() {
        if (this.workHours > 40) {
            this.bonus = 30*(this.workHours-40);
        }
    }

    void raiseSalary() {
        int diff = 2021 - this.hireYear;
        if (diff <= 10) {
            this.raise = (salary*5)/100;
        }
        if (diff >= 19) {
            this.raise = (salary*15)/100;
        }
        if (diff >= 9 && diff < 20) {
            this.raise = (salary*10)/100;
        }
    }

    void toPrint() {
        System.out.println("Name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Work Hour: " + this.workHours);
        System.out.println("Hire Year: " + this.hireYear);
        System.out.println("Tax: " + this.tax);
        System.out.println("Bonus: " + this.bonus);
        System.out.println("Raise Money: " + this.raise);
        System.out.println("Salary with bonus and tax: " + this.bonus_tax);
        System.out.println("Total: " + this.total);
    }
}
