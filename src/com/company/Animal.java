package com.company;

import java.util.Random;

public class Animal implements Interface {


    Random random=new Random();
    private char name;
    private String colour;
    private int x;
    private int y;
    private int direction;

    public Animal() {
        this.name='u';
        this.colour = "unknow";
        this.x=0;
        this.y=0;

    }

    public Animal(char name, String colour, int x, int y) {
        this.name = name;
        this.colour = colour;
        direction = random.nextInt(4);
    }

    public void setName(char name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }


    public char getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public void steps() {

    }



    @Override
    public void move() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void rest() {

    }

    @Override
    public void dead() {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}


