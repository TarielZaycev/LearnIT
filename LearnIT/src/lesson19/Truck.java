package lesson19;

public class Truck extends Car {

    @Override
    public void move () {
        System.out.println("Грузовик движется со скоростью " + super.getMaxSpeed());
    }

    public Truck(String mark, Double volumeEngine, Integer maxSpeed) {
        super(mark, volumeEngine, maxSpeed);
    }

    public Truck() {
    }
}
