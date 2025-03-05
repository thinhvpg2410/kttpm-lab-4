package bai02.decorator_parttern.decorator;

import bai02.decorator_parttern.components.Employee;

public class TruongPhongDecorator extends SalaryDecorator{

    public TruongPhongDecorator(Employee employee) {
        super(employee);
    }
    @Override
    public double getSalary() {
        return super.getSalary() + 4000000.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Phụ cấp Trưởng phòng (4,000,000 VND)";
    }
}
