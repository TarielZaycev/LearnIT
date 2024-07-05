package lesson18;

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan("Лада", 1.6,300);
        Truck truck = new Truck("volvo", 2.0, 250);

        sedan.move();
        truck.move();
    }
}
