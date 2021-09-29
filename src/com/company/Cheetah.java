package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Cheetah extends Animal {

    public Cheetah() {
        setName('C');

    }

    public Cheetah(char name,String colour, int x, int y) {
        super(name, colour, x, y);

    }

    @Override
    public void move() {
        super.move();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void rest() {
        super.rest();
    }

    @Override
    public void dead() {

        System.out.println(getName() + " " + " All the cheetas has been shot by the locals");
        super.dead();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
