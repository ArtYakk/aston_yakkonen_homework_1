package task1.classes;

import task1.abstract_classes.Mammal;

public class Bear extends Mammal {

    private final Fur fur;

    public Bear(Spine spine, Fur fur) {
        super(spine);
        this.fur = fur;
    }

}
