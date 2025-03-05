package bai02.decorator_parttern;

import bai02.decorator_parttern.components.BasicEmployee;
import bai02.decorator_parttern.components.Employee;
import bai02.decorator_parttern.decorator.TienSiDecorator;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class DecoratorMain {
    public static void main(String[] args) {
        Employee employee = new BasicEmployee();
        employee = new TienSiDecorator(employee);
        System.out.println(employee.getDescription());
        NumberFormat formatter = new DecimalFormat("#,000.00");
        System.out.println("Tổng thu nhập: " + formatter.format(employee.getSalary())  + " VND");
    }
}
