package bai02.state_pattern.state;

public class NhanVienState implements SalaryState {
    @Override
    public double getAllowance() {
        return 1000000.0;
    }

    @Override
    public String getPositionName() {
        return "Nhân viên";
    }
}
