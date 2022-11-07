package case_study.furama_resort.models;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }


    public Employee(int id,
                    String name,
                    String age,
                    String sex,
                    String idCard,
                    String email,
                    String level,
                    String position,
                    int salary) {
        super(id, name, age, sex, idCard, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String string) {
        String[] data = string.split(",");
        setId(Integer.parseInt(data[0]));
        setName((data[1]));
        setAge((data[2]));
        setSex(data[3]);
        setIdCard(data[4]);
        setEmail(data[5]);
        setLevel(data[6]);
        setPosition(data[7]);
        setSalary(Integer.parseInt(data[8]));
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                super.toString() +
                "level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getInfo() {
        return getId() + "," + getName() + "," + getAge() + "," + getSex() + "," + getIdCard() + "," + getEmail() + "," + getLevel() + "," + getPosition() + "," + getSalary();
    }
}
