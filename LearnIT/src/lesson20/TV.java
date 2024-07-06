package lesson20;

public class TV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Телик включен");
    }

    @Override
    public void turnOff() {
        System.out.println("Телик выключен");
    }
}
