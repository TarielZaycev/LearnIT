package lesson13;

public enum DeliverTypes {
    AERO("авиа доставка 1000р."),
    AUTO("авто доставка 200р."),
    STEP("пешая доставка 100р.");

    private String value;

    DeliverTypes(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
