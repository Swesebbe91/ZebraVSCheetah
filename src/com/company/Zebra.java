package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Zebra extends Animal {


    public Zebra() {
        setName('Z');
    }

    public Zebra(char name, String colour, int x, int y) {
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
        super.dead();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
