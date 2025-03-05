package bai02.decorator_parttern.decorator;

import bai02.decorator_parttern.components.Employee;

public class NhanVienDecorator extends SalaryDecorator{

    public NhanVienDecorator(Employee employee) {
        super(employee);
    }
    @Override
    public double getSalary() {
        return super.getSalary() + 1000000.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Phụ cấp Nhân viên (1,000,000 VND)";
    }
}

