package bai02.decorator_parttern.decorator;

import bai02.decorator_parttern.components.Employee;

public class TienSiDecorator extends SalaryDecorator{

    public TienSiDecorator(Employee employee) {
        super(employee);
    }
    @Override
    public double getSalary() {
        return super.getSalary() + 4500000.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Phụ cấp Tiến sĩ (4,500,000 VND)";
    }
}

