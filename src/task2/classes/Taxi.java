package task2.classes;

import task2.abstract_classes.Vehicle;
import task2.classes_parts.Wheels;
import task2.interfaces.HasWheels;

public class Taxi extends Vehicle implements HasWheels {

    private final Wheels wheels;

    public Taxi(Wheels wheels) {
        this.wheels = wheels;
    }

    @Override
    public void rotateWheels() {
        wheels.rotate();
    }
}
