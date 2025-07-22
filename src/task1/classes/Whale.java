package task1.classes;

import task1.abstract_classes.Mammal;
import task1.interfaces.Water;

public class Whale extends Mammal implements Water {

    public Whale(Spine spine) {
        super(spine);
    }

    @Override
    public void info() {
        System.out.println("I live in the ocean");
    }
}
