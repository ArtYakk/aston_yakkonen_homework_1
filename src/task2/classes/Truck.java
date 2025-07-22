package task2.classes;

import task2.abstract_classes.Vehicle;
import task2.classes_parts.Wheels;
import task2.interfaces.CarriesCargo;
import task2.interfaces.HasWheels;

public class Truck extends Vehicle implements CarriesCargo, HasWheels {

    private final Wheels wheels;

    public Truck(Wheels wheels) {
        this.wheels = wheels;
    }

    @Override
    public void carry() {
        System.out.println("Carrying cargo in a truck");
    }

    @Override
    public void rotateWheels() {
        wheels.rotate();
    }
}
