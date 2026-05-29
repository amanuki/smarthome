package smarthome;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SmartLight light = new SmartLight("Porch Light");
        SmartThermostat thermostat = new SmartThermostat("Thermostat");
        SmartCamera camera = new SmartCamera("Security Camera");

        SmartDevice[] devices = new SmartDevice[] { light, thermostat, camera };

        boolean running = true;
        System.out.println("=== Smart Home System ===");

        while (running) {
            System.out.println("\n--- Current Status ---");
            for (SmartDevice device : devices) {
                device.showStatus();
            }

            System.out.println("\n--- Actions ---");
            System.out.println("1. Turn On All Devices");
            System.out.println("2. Change Light Brightness");
            System.out.println("3. Change Thermostat Temperature");
            System.out.println("4. Start/Stop Camera Recording");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.hasNextInt() ? scanner.nextInt() : 5;

            switch (choice) {
                case 1:
                    System.out.println();
                    for (SmartDevice device : devices) {
                        device.turnOn();
                    }
                    break;

                case 2:
                    System.out.print("\nEnter brightness (0-100): ");
                    int brightness = scanner.nextInt();
                    light.turnOn(brightness);
                    break;

                case 3:
                    System.out.print("\nEnter temperature (15-30): ");
                    int temp = scanner.nextInt();
                    thermostat.setTemperature(temp);
                    break;

                case 4:
                    System.out.print("\nRecord video? (true/false): ");
                    boolean record = scanner.nextBoolean();
                    camera.setRecording(record);
                    break;

                case 5:
                    System.out.println("\nExiting program.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
        scanner.close();
    }
}