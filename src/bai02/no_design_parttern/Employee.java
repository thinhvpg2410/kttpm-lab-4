package bai02.no_design_parttern;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Employee {
    public static final double BASE_SALARY = 10000000.0;
    private int id;
    private String name;
    private Position position;

    public Employee(int id, String name, Position position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public Employee() {
    }

    public double totalSalary() {
        return BASE_SALARY + this.position.getAllowance();
    }

    public void displaySalary() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Nhân viên: " + this.name);
        System.out.println("Chức vụ: " + this.position);
        System.out.println("Lương cơ bản: " + formatter.format(BASE_SALARY) + " VND");
        System.out.println("Phụ cấp: " + formatter.format(this.position.getAllowance()) + " VND");
        System.out.println("Tổng thu nhập: " +  formatter.format(totalSalary()) + " VND");
    }


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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
