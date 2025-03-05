package factory;

public class Bicycle implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Bicycle driving");
    }
}
