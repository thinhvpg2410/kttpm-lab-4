package bai02.state_pattern.context;

import bai02.no_design_parttern.Position;
import bai02.state_pattern.state.SalaryState;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Employee {
    public static final double BASE_SALARY = 10000000.0;
    private int id;
    private String name;
    private SalaryState salaryState;


    public Employee(int id, String name, SalaryState salaryState) {
        this.id = id;
        this.name = name;
        this.salaryState = salaryState;
    }

    public Employee() {
    }

    public double totalSalary() {
        return BASE_SALARY + this.salaryState.getAllowance();
    }

    public void displaySalary() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Nhân viên: " + this.name);
        System.out.println("Chức vụ: " + this.salaryState.getPositionName());
        System.out.println("Lương cơ bản: " + formatter.format(BASE_SALARY) + " VND");
        System.out.println("Phụ cấp: " + formatter.format(this.salaryState.getAllowance()) + " VND");
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

    public SalaryState getSalaryState() {
        return salaryState;
    }

    public void setSalaryState(SalaryState salaryState) {
        this.salaryState = salaryState;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salaryState=" + salaryState +
                '}';
    }
}
