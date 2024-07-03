package lesson13;

public class Main {
    public static void main(String[] args) {
        Body body = new Body("Седан");
        Wheels wheels = new Wheels(4);
        Engine engine = new Engine("BMW", 6.3);

        Car car = new Car(engine, body, wheels);

        System.out.println(car);
    }
}
