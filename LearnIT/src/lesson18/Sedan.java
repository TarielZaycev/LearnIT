package lesson18;

public class Sedan extends Car{

    public void move (){
        System.out.println("Легковая движется со скоростью " + super.getMaxSpeed());
    }

    public Sedan(String mark, Double volumeEngine, Integer maxSpeed) {
        super(mark, volumeEngine, maxSpeed);
    }

    public Sedan() {
    }
}
