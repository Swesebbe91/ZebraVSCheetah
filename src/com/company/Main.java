package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ZebraList zebraList = new ZebraList();
        CheetahList cheetahList = new CheetahList();


        GameBoard gameBoard=new GameBoard();
        gameBoard.printGameBoard();



    }
}

/*
            Scanner scan = new Scanner(System.in);
            System.out.println("*******************************");
            System.out.println("Skriv in storleken på Gameboard");
            System.out.println("*******************************");
            System.out.println("Antal rader: \r");
            int r = scan.nextInt();
            System.out.println("Antal kolumner: \r");
            int c = scan.nextInt();
            String[][] str = new String[r][c];

            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    System.out.print("[ ]");

                }
                System.out.println();
            }
        }
    }
}
*/
