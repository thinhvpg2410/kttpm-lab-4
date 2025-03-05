package bai02.state_pattern.state;

public class TruongPhongState implements SalaryState {
    @Override
    public double getAllowance() {
        return 4000000.0;
    }

    @Override
    public String getPositionName() {
        return "Trưởng Phòng";
    }
}
