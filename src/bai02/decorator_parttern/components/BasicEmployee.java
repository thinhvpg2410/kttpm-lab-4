package bai02.decorator_parttern.components;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.logging.Formatter;

public class BasicEmployee implements Employee {
    private static final double BASE_SALARY = 10000000.0;
    private int id;
    private String name;

    public BasicEmployee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public BasicEmployee() {
    }

    @Override
    public double getSalary() {
        return BASE_SALARY;
    }

    @Override
    public String getDescription() {
        return "Nhân viên: " + name + " (Lương cơ bản: " + BASE_SALARY + " VND)";
    }
}
