package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class CheetahList {
    private ArrayList<Cheetah> listOfCheetahs; //secure our list

    public CheetahList() {
        this.listOfCheetahs = new ArrayList<Cheetah>();
    } //Create a new arraylist of the object Cheetahs


    public void userInputNumCheetahs() { //Input from the user to add Cheetahs
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of Cheetahs in the game");
        int cheetahs = (scan.nextInt());
        for (int i = 0; i < cheetahs; i++) {

            listOfCheetahs.add(new Cheetah()); //Add cheetahs to our list

        }
    }

    public void clear(){
        listOfCheetahs.clear();
    }
    public void removeCheetahs(int quantity) { //Method to remove 1 object
        listOfCheetahs.remove(quantity);
    }

    public void printaCheetahsListan() { //Print the list of Cheetahs
        for (int i = 0; i < listOfCheetahs.size(); i++) {
            System.out.println("Cheetahs " + (i + 1) + " " + listOfCheetahs.get(i).getName());
            //Cheetahs number: + name of each cheetahs

        }
    }

    public int sizeOfCheetahsList() { //Method to know the length of the list

        return listOfCheetahs.size();
    }

}
