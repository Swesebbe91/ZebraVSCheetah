package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GameBoard {
    //Arrays för Zebra och Cheetah
    //"Tagg" för respektive Djur
    //Koppla Gameboard till animal
    //Koppla Gameboard till GameEngine
    //Skapa en ForLoop med vilkor
    CheetahList cheetahList = new CheetahList();
    ZebraList zebraList = new ZebraList();

    Zebra zebra=new Zebra();
    Cheetah cheetah=new Cheetah();

    //int r;
    //int c;
    GameBoard board;

    public GameBoard() {

    }



    Scanner scan = new Scanner(System.in);

    public void printGameBoard() {
        System.out.println("*******************************");
        System.out.println("Skriv in storleken på Gameboard");
        System.out.println("*******************************");
        int rows = rows(); //Metod som skapar rader
        int columns = coloumns(); //Metod som skapar kolumner
        char [][] brd = new char[rows][columns]; //Skapar en arraylist som blir spelbrädan
            setValueGameboard(rows, columns, brd);

            zebraList.userInputNumZebra();
            cheetahList.userInputNumCheetahs();

            for (int i = 0; i < cheetahList.sizeOfCheetahsList(); i++) {
                cheetah.setX(rows);
                cheetah.setY(columns);
                int i1 = cheetah.getX();
                int j1 = cheetah.getY();
                brd[i1][j1] = cheetah.getName();
            }
            for (int i = 0; i < zebraList.sizeOfZebraList(); i++) {
                zebra.setX(rows);
                zebra.setY(columns);

                int i1 = zebra.getX();
                int j1 = zebra.getY();
                brd[i1][j1] = zebra.getName();
            }

        printTheGrid(rows, columns, brd); //printar ut spelbrädans rader + kolumner via en metod

    }
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


