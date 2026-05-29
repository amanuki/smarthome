package smarthome;

public class SmartThermostat extends SmartDevice {
    private int temperature;

    public SmartThermostat(String name) {
        super(name);
        this.temperature = 22;
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            System.out.println(getName() + " is ON and set to " + temperature + "°C.");
        } else {
            System.out.println(getName() + " is OFF.");
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature >= 15 && temperature <= 30) {
            this.temperature = temperature;
            System.out.println(getName() + " temperature changed to " + temperature + "°C.");
        } else {
            System.out.println("Error: Use a temperature between 15°C and 30°C.");
        }
    }
}