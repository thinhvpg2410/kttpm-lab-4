package bai02.decorator_parttern.decorator;

import bai02.decorator_parttern.components.Employee;

public abstract class SalaryDecorator implements Employee {
    protected Employee employee;

    public SalaryDecorator(Employee employee) {
        this.employee = employee;
    }

    @Override
    public double getSalary() {
        return employee.getSalary();
    }

    @Override
    public String getDescription() {
        return employee.getDescription();
    }
}
