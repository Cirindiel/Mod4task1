class Televisor {
    String tvStatus;

    Televisor(String tvStatus) {
        this.tvStatus = tvStatus;
    }

    void turnOn() {
        tvStatus = "ON";
    }

    void turnOff() {
        tvStatus = "OFF";
    }

    void showStatus() {
        System.out.println("Status telewizora: " + tvStatus);
    }
}
