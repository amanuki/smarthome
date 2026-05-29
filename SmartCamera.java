package smarthome;

public class SmartCamera extends SmartDevice {
    private boolean isRecording;

    public SmartCamera(String name) {
        super(name);
        this.isRecording = false;
    }

    @Override
    public void showStatus() {
        if (isOn()) {
            if (isRecording) {
                System.out.println(getName() + " is ON and RECORDING.");
            } else {
                System.out.println(getName() + " is ON but not recording.");
            }
        } else {
            System.out.println(getName() + " is OFF.");
        }
    }

    public boolean isRecording() {
        return isRecording;
    }

    public void setRecording(boolean isRecording) {
        if (isOn()) {
            this.isRecording = isRecording;
            if (isRecording) {
                System.out.println(getName() + " started recording.");
            } else {
                System.out.println(getName() + " stopped recording.");
            }
        } else {
            System.out.println("Error: Turn on the camera first.");
        }
    }
}