package factory;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getVehicle("car");
        car.drive();

        Vehicle motorbike = VehicleFactory.getVehicle("motorbike");
        motorbike.drive();

        Vehicle bicycle = VehicleFactory.getVehicle("bicycle");
        bicycle.drive();
    }
}
