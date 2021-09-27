package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class ZebraList {
    private ArrayList<Zebra> listOfZebras; //Secure our list

    public ZebraList() {
        this.listOfZebras = new ArrayList<Zebra>(); //Create a new arraylist of the object Zebra
    }


    public void userInputNumZebra() { //Method to add Zebras from the users input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Zebras in the game");
        int zebras = (scan.nextInt());
        for (int i = 0; i < zebras; i++) {

            listOfZebras.add(new Zebra()); //add Zebras to the list
        }
    }

    public void clear(){
        listOfZebras.clear();
    }
    public void removeZebras(int quantity) { //Method to remove 1 object from the list
        listOfZebras.remove(quantity);
    }

    public void printaZebraListan() { //Print the list of Zebras
        for (int i = 0; i < listOfZebras.size(); i++) {
            System.out.println("Zebra " + (i + 1) + " " + listOfZebras.get(i).getName());

        }
    }

    public int sizeOfZebraList() { //Method to know the length of the list

        return listOfZebras.size();
    }

}
