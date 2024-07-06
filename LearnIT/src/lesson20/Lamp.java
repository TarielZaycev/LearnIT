package lesson20;

public class Lamp implements Device{
    @Override
    public void turnOn() {
        System.out.println("Лампа включена");
    }

    @Override
    public void turnOff() {
        System.out.println("Лампа выключена");
    }
}
