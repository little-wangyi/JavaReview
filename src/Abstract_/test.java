package Abstract_;

public class test {
    public static void main(String[] args) {
        Manager m = new Manager(1, "老王", 20000);
        m.setBonus(8000);
        m.work();
    }
}

abstract class Employee {
    public int id;
    public String name;
    public float salary;

    public Employee(int id, String name, float salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    abstract void work();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}

class Manager extends Employee {
    private float bonus;

    public Manager(int id, String name, float salary) {
        super(id, name, salary);
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    @Override
    void work() {
        System.out.println("经理" + getName() + "工资" + getSalary() + "本月的奖金" + this.bonus);
    }
}