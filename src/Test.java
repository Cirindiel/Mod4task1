public class Test {
    public static void main(String[] args) {
        Televisor televisior = new Televisor("OFF");

        televisior.showStatus();
        televisior.turnOn();
        televisior.showStatus();
        televisior.turnOff();
        televisior.showStatus();
    }
}
