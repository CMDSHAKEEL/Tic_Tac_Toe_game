package com.bridgelabz;

import java.util.Scanner;

public class Tic_Tac_game_UC1 {
	 ////assign a Char 1D array as a static
    static char[] arr = new char[10];

    //(can Calling from Main method) assign a empty space char by using 1D array
    void CreateBoard() {
        for (int i = 0; i < 10; i++) {
           
        }
    }
    //display Tic Tac Toe 1D array Box
    //(can Calling from Main method)
    static void disp() {
        System.out.println("display Tic Tac Toe Box using 1D array");
        System.out.println(arr[0] + " | " + arr[1] + " | " + arr[2] + " | " +arr[3] + " | " );
        System.out.println("---------");
         
    }

 
	
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   Tic_Tac_game_UC1 t = new Tic_Tac_game_UC1();
	        t.CreateBoard();
	        t.disp();


	
	    }
	}