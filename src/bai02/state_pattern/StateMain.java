package bai02.state_pattern;

import bai02.state_pattern.context.Employee;
import bai02.state_pattern.state.TruongPhongState;

public class StateMain {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setSalaryState(new TruongPhongState());
        employee.displaySalary();
    }
}
