package factory;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if (type == null) {
            return null;
        }
        switch (type.toLowerCase()) {
            case "car":
                return new Car();
            case "motorbike":
                return new Motorbike();
            case "bicycle":
                return new Bicycle();
            default:
                throw new IllegalArgumentException("Loại phương tiện không hợp lệ: " + type);
        }
    }
}
