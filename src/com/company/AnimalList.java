/*<ackage com.company;

import java.util.Scanner;

public class AnimalList {

    // private ArrayList<Zebra> zebras;
    Animal [] animalList = new Animal[2];
    an

    CheetahList cheetahList = new CheetahList();


    public AnimalList() {

    }

    public AnimalList(Zebra zebra, Cheetah cheetah) {
        this.zebraList = zebraList;
        this.cheetahList = cheetahList;
    }


    public void termsOfGame() {

        boolean numOfAnimals = false;

        while (numOfAnimals == false) {
            zebraList.userInputNumZebra();
            cheetahList.userInputNumCheetahs();

            if (zebraList.sizeOfZebraList() >= cheetahList.sizeOfCheetahsList() && cheetahList.sizeOfCheetahsList() > 0) {
                System.out.println("Antal Zebror: " + zebraList.sizeOfZebraList());
                System.out.println("Antal Geparder: " + cheetahList.sizeOfCheetahsList());
                System.out.println("Let the party begin!");
                numOfAnimals = true;
            } else {
                zebraList.clear();
                cheetahList.clear();
                System.out.println("You have entered the wrong number of animals\n" +
                        "Game rules!: \n" +
                        "The amount of Zebras must be equal or more than the amount of cheetas,\nthe amount of animals can not be zero. ");


            }
        }
    }
}

*/




