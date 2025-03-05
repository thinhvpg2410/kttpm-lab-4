package bai02.state_pattern.state;

public class TienSiState implements SalaryState {
    @Override
    public double getAllowance() {
        return 4500000.0;
    }

    @Override
    public String getPositionName() {
        return "Tiến sĩ";
    }
}
