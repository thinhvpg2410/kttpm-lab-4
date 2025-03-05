package bai02.decorator_parttern.decorator;

import bai02.decorator_parttern.components.Employee;

public class TruongKhoaDecorator extends SalaryDecorator{

    public TruongKhoaDecorator(Employee employee) {
        super(employee);
    }
    @Override
    public double getSalary() {
        return super.getSalary() + 5000000.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Phụ cấp Trưởng khoa (5,000,000 VND)";
    }
}
