package smarthome;

public class SmartDevice {
    private String name;
    private boolean isOn;

    public SmartDevice(String name) {
        this.name = name;
        this.isOn = false;
    }

    public void showStatus() {
        if (isOn) {
            System.out.println(name + " is ON.");
        } else {
            System.out.println(name + " is OFF.");
        }
    }

    public void turnOn() {
        this.isOn = true;
        System.out.println(name + " turned ON.");
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    protected void setOn(boolean isOn) {
        this.isOn = isOn;
    }
}