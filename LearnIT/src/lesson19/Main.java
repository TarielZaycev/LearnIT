package lesson19;

public class Main {
    public static void main(String[] args) {
        Car sedan = new Sedan("lada", 1.6,200);
        Car truck = new Truck("volvo", 6.3,300);

        sedan.move();
        truck.move();
    }
}
