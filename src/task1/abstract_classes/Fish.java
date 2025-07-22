package task1.abstract_classes;

import task1.interfaces.Water;

public abstract class Fish extends Animal implements Water {

    @Override
    public void info() {
        System.out.println("I live in water");
    }

}
