package task2.classes;

import task2.abstract_classes.Vehicle;
import task2.classes_parts.Propeller;
import task2.interfaces.CarriesCargo;
import task2.interfaces.HasPropeller;

public class Tanker extends Vehicle implements CarriesCargo, HasPropeller {

    private final Propeller propeller;

    public Tanker(Propeller propeller) {
        this.propeller = propeller;
    }

    @Override
    public void carry() {
        System.out.println("Carrying cargo in a tanker");
    }

    @Override
    public void turnOnPropeller() {
        propeller.turnOn();
    }
}
