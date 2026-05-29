package smarthome;

public class SmartLight extends SmartDevice {
    private int brightness;

    public SmartLight(String name) {
        super(name);
        this.brightness = 100;
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println(getName() + " is ON at " + brightness + "% brightness.");
        } else {
            System.out.println(getName() + " is OFF.");
        }
    }

    public void turnOn(int brightness) {
        setOn(true);
        setBrightness(brightness);
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        if (brightness >= 0 && brightness <= 100) {
            this.brightness = brightness;
            System.out.println(getName() + " brightness changed to " + brightness + "%.");
        } else {
            System.out.println("Error: Use a number between 0 and 100.");
        }
    }
}