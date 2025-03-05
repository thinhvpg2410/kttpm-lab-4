package bai02.no_design_parttern;

public enum Position {
    TRUONG_KHOA("Trưởng khoa", 5000000.0),
    TO_TRUONG("Tổ trưởng", 3000000.0),
    TRUONG_PHONG("Trưởng phòng", 4000000.0),
    TIEN_SI("Tiến sĩ", 4500000.0),
    NHAN_VIEN("Nhân viên", 1000000.0),
    UNKNOWN("Không xác định", 0.0);

    private final String title;
    private final double allowance;

    Position(String title, double allowance) {
        this.title = title;
        this.allowance = allowance;
    }

    public double getAllowance() {
        return allowance;
    }

    public static Position fromString(String text) {
        for (Position pos : Position.values()) {
            if (pos.title.equalsIgnoreCase(text)) {
                return pos;
            }
        }
        return UNKNOWN;
    }
}
