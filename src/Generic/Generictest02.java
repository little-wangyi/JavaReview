package Generic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Generictest02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("小A", 30, new myDate(1993,1,1)));
        employees.add(new Employee("小B", 29, new myDate(1992,1,2)));
        employees.add(new Employee("小A", 28, new myDate(1992,1,3)));
        System.out.println(employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int i = o1.getName().compareTo(o2.getName());
                if(i != 0){
                    return i;
                }
                i = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                if(i !=0){
                    return i;
                }
                i = o1.getBirthday().getMonth()-o2.getBirthday().getMonth();
                if (i!=0){
                    return i;
                }
                i= o1.getBirthday().getDay()-o2.getBirthday().getDay();
                if (i!=0){
                    return i;
                }
                return 0;
            }
        });
        System.out.println(employees);
    }
}

class Employee {
    private String name;
    private int income;
    private myDate birthday;

    public Employee(String name, int income, myDate birthday) {
        this.name = name;
        this.income = income;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getincome() {
        return income;
    }

    public void setincome(int income) {
        this.income = income;
    }

    public myDate getBirthday() {
        return birthday;
    }

    public void setBirthday(myDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", income=" + income +
                ", birthday=" + birthday +
                '}';
    }
}

class myDate {
    private int month;
    private int day;
    private int year;

    public myDate(int year, int month, int day) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "myDate{" +
                "month=" + month +
                ", day=" + day +
                ", year=" + year +
                '}';
    }
}