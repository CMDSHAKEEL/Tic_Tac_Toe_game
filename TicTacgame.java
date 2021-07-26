package com.bridgelabz;



public class TicTacgame {
	 ////assign a Char 1D array as a static
    static char[] board = new char[10];
    

     /**(can Calling from Main method)  
 		*     assign a empty space char by using 1D array
      */
    void CreateBoard() {
        for (int i = 1; i < board.length; i++) {
        	board[i]= ' ';
        }
        
    }
    //display Tic Tac Toe 1D array Box
    //(can Calling from Main method)
     
	
	public static void main(String[] args) {
		System.out.println("*******WELCOME TO THE GAME**********");
		   TicTacgame t = new TicTacgame();
	        t.CreateBoard();
	        

	
	    }
	}