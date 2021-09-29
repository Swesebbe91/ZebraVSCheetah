package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GameBoard {
    //Arrays för Zebra och Cheetah
    //"Tagg" för respektive Djur
    //Koppla Gameboard till animal
    //Koppla Gameboard till GameEngine
    //Skapa en ForLoop med vilkor
    CheetahList cheetahList = new CheetahList();
    ZebraList zebraList = new ZebraList();
    GameEngine gameEngine = new GameEngine();

    Zebra zebra=new Zebra();
    Cheetah cheetah=new Cheetah();
    private int row;
    private int columns;

    GameBoard board;

    public GameBoard() {

    }

    Scanner scan = new Scanner(System.in);

    public void printGameBoard() {
        Random random = new Random();
        System.out.println("*******************************");
        System.out.println("Skriv in storleken på Gameboard");
        System.out.println("*******************************");
        row = rows();
        //Metod som skapar rader
        columns = coloumns(); //Metod som skapar kolumner
        char [][] brd = new char[row][columns];
            //Skapar en array som blir spelbrädan
            setValueGameboard(row, columns, brd);

        boolean numOfAnimals = true;

        while (numOfAnimals) {

            zebraList.userInputNumZebra();
           cheetahList.userInputNumCheetahs();
            if (zebraList.sizeOfZebraList() >= cheetahList.sizeOfCheetahsList() && cheetahList.sizeOfCheetahsList() > 0) {
                System.out.println("Antal Zebror: " + zebraList.sizeOfZebraList());
                System.out.println("Antal Geparder: " + cheetahList.sizeOfCheetahsList());
                System.out.println("Let the party begin!");
                numOfAnimals = false;
            } else {
                zebraList.clear();
                cheetahList.clear();
                System.out.println("You have entered the wrong number of animals\n" +
                        "Game rules!: \n" +
                        "The amount of Zebras must be equal or more than the amount of cheetas,\n" + "the amount of animals can not be zero. \n");
            }
        }
        int number1;
        int number2;
            for (int i = 0; i < cheetahList.sizeOfCheetahsList(); i++) {

                number1 = random.nextInt(row);
                number2 = random.nextInt(columns);
                cheetahList.getListOfCheetahs().get(i).setY(number1);
                cheetahList.getListOfCheetahs().get(i).setX(number2);

                int i1 = cheetahList.getListOfCheetahs().get(i).getY();
                int j1 = cheetahList.getListOfCheetahs().get(i).getX();
                brd[i1][j1] = cheetahList.getListOfCheetahs().get(i).getName();

            }

            for (int i = 0; i < zebraList.sizeOfZebraList(); i++) {
                number1 = random.nextInt(row);
                number2 = random.nextInt(columns);
                zebraList.getListOfZebras().get(i).setY(number1);
                zebraList.getListOfZebras().get(i).setX(number2);

                int i1 = zebraList.getListOfZebras().get(i).getY();
                int j1 = zebraList.getListOfZebras().get(i).getX();
                brd[i1][j1] = zebraList.getListOfZebras().get(i).getName();
            }
        printTheGrid(row, columns, brd); //printar ut spelbrädans rader + kolumner via en metod
        setValueGameboard(row, columns, brd);

        boolean ison = true;
            //HÄR BÖRJAR SPELET EFTER FÖRSTA POSITIONERING
        //while (ison) {

            //MOVEMENT

            int maxRow = row - 1;
            int maxColumn = columns - 1;

            for (int i = 0; i < zebraList.sizeOfZebraList(); i++) {
                Random randomize = new Random();
                int newRandom = random.nextInt(3);
                int positionX;
                int positionY;

                switch (newRandom) {

                    case 0: //"up"
                        positionX = zebraList.getListOfZebras().get(i).getX();
                        positionY = zebraList.getListOfZebras().get(i).getY();
                        positionY -= 2;

                        if (positionY < 0) {
                            positionY = 0;
                        }
                        zebraList.getListOfZebras().get(i).setY(positionY);
                        brd[positionY][positionX] = zebraList.getListOfZebras().get(i).getName();
                        break;

                    case 1: //"down"
                        positionX = zebraList.getListOfZebras().get(i).getX();
                        positionY = zebraList.getListOfZebras().get(i).getY();
                        positionY += 2;

                        if (positionY > maxRow) {
                            positionY = maxRow;
                        }
                        zebraList.getListOfZebras().get(i).setY(positionY);
                        brd[positionY][positionX] = zebraList.getListOfZebras().get(i).getName();
                        break;

                    case 2: //"left"
                        positionX = zebraList.getListOfZebras().get(i).getX();
                        positionY = zebraList.getListOfZebras().get(i).getY();
                        positionX -= 2;

                        if (positionX < 0) {
                            positionX = 0;
                        }
                        zebraList.getListOfZebras().get(i).setX(positionX);
                        brd[positionY][positionX] = zebraList.getListOfZebras().get(i).getName();
                        break;

                    case 3: //"right"
                        positionX = zebraList.getListOfZebras().get(i).getX();
                        positionY = zebraList.getListOfZebras().get(i).getY();
                        positionX += 2;

                        if (positionX > maxColumn) {
                            positionX = maxColumn;
                        }
                        zebraList.getListOfZebras().get(i).setX(positionX);
                        brd[positionY][positionX] = zebraList.getListOfZebras().get(i).getName();
                        break;

                    default:
                        break;
                }

            }

            for (int i = 0; i < cheetahList.sizeOfCheetahsList(); i++) {

                Random randomize = new Random();
                int newRandom = random.nextInt(3);

                switch (newRandom) {

                    case 0: //"up"
                        int positionX = cheetahList.getListOfCheetahs().get(i).getX();
                        int positionY = cheetahList.getListOfCheetahs().get(i).getY();
                        positionY -= 2;

                        if (positionY < 0) {
                            positionY = 0;
                        }
                        cheetahList.getListOfCheetahs().get(i).setY(positionY);
                        brd[positionY][positionX] = cheetahList.getListOfCheetahs().get(i).getName();
                        break;

                    case 1: //"down"
                        positionX = cheetahList.getListOfCheetahs().get(i).getX();
                        positionY = cheetahList.getListOfCheetahs().get(i).getY();
                        positionY += 2;

                        if (positionY > maxRow) {
                            positionY = maxRow;
                        }
                        cheetahList.getListOfCheetahs().get(i).setY(positionY);
                        brd[positionY][positionX] = cheetahList.getListOfCheetahs().get(i).getName();
                        break;

                    case 2: //"left"
                        positionX = cheetahList.getListOfCheetahs().get(i).getX();
                        positionY = cheetahList.getListOfCheetahs().get(i).getY();
                        positionX -= 2;

                        if (positionX < 0) {
                            positionX = 0;
                        }
                        cheetahList.getListOfCheetahs().get(i).setX(positionX);
                        brd[positionY][positionX] = cheetahList.getListOfCheetahs().get(i).getName();
                        break;

                    case 3: //"right"
                        positionX = cheetahList.getListOfCheetahs().get(i).getX();
                        positionY = cheetahList.getListOfCheetahs().get(i).getY();
                        positionX += 2;

                        if (positionX > maxColumn) {
                            positionX = maxColumn;
                        }
                        cheetahList.getListOfCheetahs().get(i).setX(positionX);
                        brd[positionY][positionX] = cheetahList.getListOfCheetahs().get(i).getName();
                        break;

                    default:
                        break;
                }

            }


            System.out.println("\n");

            printTheGrid(row, columns, brd);
            setValueGameboard(row, columns, brd);
        }
        //}


 //A method to create rows
    public int rows() {
        System.out.println("Antal rader: \r");
        int rows = scan.nextInt();
        return rows;
    }
 //A method to create columns
    public int coloumns() {
        System.out.println("Antal kolumner: \r");
        int columns = scan.nextInt();
        return columns;
    }

    //A method to print our grid

        public void printTheGrid(int rows, int columns, char[][] brd) { //Skapa en metod som
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("[" + brd[i][j] +  "]");
            }
            System.out.println();
        }
    }
    public void setValueGameboard(int rows, int columns, char[][] brd) { //printa ut värde till spelplanen
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                brd[i][j] = '*'; //ge värde * innanför [ ]
            }
        }
    }

}


