package task2.classes;

import task2.abstract_classes.Vehicle;
import task2.classes_parts.Propeller;
import task2.classes_parts.Wheels;
import task2.classes_parts.Wings;
import task2.interfaces.CarriesCargo;
import task2.interfaces.HasPropeller;
import task2.interfaces.HasWheels;
import task2.interfaces.HasWings;

public class Airplane extends Vehicle implements CarriesCargo, HasWheels, HasPropeller, HasWings {

    private final Wheels wheels;
    private final Propeller propeller;
    private final Wings wings;

    public Airplane(Wheels wheels, Propeller propeller, Wings wings) {
        this.wheels = wheels;
        this.propeller = propeller;
        this.wings = wings;
    }

    @Override
    public void carry() {
        System.out.println("Carrying cargo on airplane");
    }

    @Override
    public void turnOnPropeller() {
        propeller.turnOn();
    }

    @Override
    public void rotateWheels() {
        wheels.rotate();
    }

    @Override
    public void turnAirplane() {
        wings.turn();
    }
}
