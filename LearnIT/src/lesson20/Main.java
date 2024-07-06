package lesson20;

public class Main {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();
        remoteController.powerOn(new Lamp());
    }
}
