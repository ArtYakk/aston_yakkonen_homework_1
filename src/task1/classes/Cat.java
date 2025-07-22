package task1.classes;

import task1.abstract_classes.Mammal;

public class Cat extends Mammal {

    private final Fur fur;

    public Cat(Spine spine, Fur fur) {
        super(spine);
        this.fur = fur;
    }

}
