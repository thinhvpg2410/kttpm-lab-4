package bai02.state_pattern.state;

public class ToTruongState implements SalaryState {
    @Override
    public double getAllowance() {
        return 3000000.0;
    }

    @Override
    public String getPositionName() {
        return "Tổ trưởng";
    }
}
