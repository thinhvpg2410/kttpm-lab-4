package bai02.state_pattern.state;

public class TruongKhoaState implements SalaryState {
    @Override
    public double getAllowance() {
        return 5000000.0;
    }

    @Override
    public String getPositionName() {
        return "Trưởng khoa";
    }
}
