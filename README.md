# Smart Home System (MVP)

This is a simple console-based program written in Java that simulates a smart home system. It allows you to check the status of household devices like light, thermostat, and a camera and control them through an interactive menu.

---

## File Structure

* `SmartDevice.java` - The base class for all items.
* `SmartLight.java` - A subclass for handling light brightness.
* `SmartThermostat.java` - A subclass for handling room temperature.
* `SmartCamera.java` - A subclass for handling security video recording.
* `Main.java` - The entry point that runs the program menu.

---

## Where OOP Concepts Are Used

### 1. Classes and Objects 
* **Classes:** Defined across all 5 files to create blueprints for different household assets.
* **Objects:** Created inside `Main.java` inside the `main` method where the `light`, `thermostat`, and `camera` instances are built.

### 2. Encapsulation
* All variables like `name`, `isOn`, `brightness`, `temperature`, and `isRecording` use the `private` keyword so they can not be changed directly from outside the class.
* Safety rules are built into the setter methods to block invalid inputs:
  * `SmartLight.java` limits brightness between 0 and 100.
  * `SmartThermostat.java` limits temperature between 15°C and 30°C.
  * `SmartCamera.java` stops the user from recording if the camera is powered off.

### 3. Inheritance 
* `SmartLight`, `SmartThermostat`, and `SmartCamera` use the `extends` keyword to inherit from `SmartDevice`.
* They automatically share common fields (`name`, `isOn`) and basic actions (`turnOn()`) without rewriting any code.

### 4. Polymorphism 
* **Method Overriding (Runtime Polymorphism):** The `showStatus()` method is created in the base class and rewritten differently inside each subclass. In `Main.java`, the program loops through a generic `SmartDevice[]` array and automatically calls the correct version of `showStatus()` for each device type at runtime.
* **Method Overloading (Compile-Time Polymorphism):** `SmartLight.java` has an overloaded version of the `turnOn()` method. It inherits `turnOn()` with no arguments from the base class, but adds a second version, `turnOn(int brightness)`, which accepts an integer to set both power and light levels at the same time.

