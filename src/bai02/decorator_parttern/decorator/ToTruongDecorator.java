package bai02.decorator_parttern.decorator;

import bai02.decorator_parttern.components.Employee;

public class ToTruongDecorator extends SalaryDecorator{

    public ToTruongDecorator(Employee employee) {
        super(employee);
    }
    @Override
    public double getSalary() {
        return super.getSalary() + 3000000.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Phụ cấp Tổ trưởng (3,000,000 VND)";
    }
}
