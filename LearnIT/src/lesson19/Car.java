package lesson19;

public abstract class Car {
    private String mark;
    private Double volumeEngine;
    private Integer maxSpeed;

    public void signal(){
        System.out.println("Бип-бип");
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public Double getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(Double volumeEngine) {
        this.volumeEngine = volumeEngine;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car(String mark, Double volumeEngine, Integer maxSpeed) {
        this.mark = mark;
        this.volumeEngine = volumeEngine;
        this.maxSpeed = maxSpeed;
    }

    public Car() {
    }

    public abstract void move();
}
