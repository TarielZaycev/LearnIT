package lesson13;

public class Body {
    private String type;

    public Body(String type) {
        this.type = type;
    }

    public Body() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "type: " + type;
    }
}
