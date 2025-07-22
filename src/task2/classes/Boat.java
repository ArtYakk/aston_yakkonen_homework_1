package task2.classes;

import task2.abstract_classes.Vehicle;
import task2.classes_parts.Propeller;
import task2.interfaces.CarriesCargo;
import task2.interfaces.HasPropeller;

public class Boat extends Vehicle implements CarriesCargo, HasPropeller {
    private final Propeller propeller;

    public Boat(Propeller propeller) {
        this.propeller = propeller;
    }

    @Override
    public void carry() {
        System.out.println("Carrying cargo in the a boat");
    }

    @Override
    public void turnOnPropeller() {
        propeller.turnOn();
    }
}
