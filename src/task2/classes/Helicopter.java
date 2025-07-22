package task2.classes;

import task2.abstract_classes.Vehicle;
import task2.classes_parts.Propeller;
import task2.classes_parts.Wheels;
import task2.interfaces.CarriesCargo;
import task2.interfaces.HasPropeller;
import task2.interfaces.HasWheels;

public class Helicopter extends Vehicle implements CarriesCargo, HasWheels, HasPropeller {

    private final Wheels wheels;
    private final Propeller propeller;

    public Helicopter(Wheels wheels, Propeller propeller) {
        this.wheels = wheels;
        this.propeller = propeller;
    }

    @Override
    public void carry() {
        System.out.println("Carrying cargo in a helicopter");
    }

    @Override
    public void turnOnPropeller() {
        propeller.turnOn();
    }

    @Override
    public void rotateWheels() {
        wheels.rotate();
    }
}
