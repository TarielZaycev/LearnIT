package lesson13;

public class Wheels {
    private int count;

    public Wheels(int count) {
        this.count = count;
    }

    public Wheels() {
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "count: " + count;
    }
}
