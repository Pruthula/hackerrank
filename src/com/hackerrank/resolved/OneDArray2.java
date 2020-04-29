package com.hackerrank.resolved;

import java.util.Arrays;
import java.util.Scanner;

/*
Let's play a game on an array! You're standing at index 0 of an n-element array named game. From some index i (where 0 <= i < n), you can perform one of the following moves:

* Move Backward: If cell i-1 exists and contains a 0, you can walk back to cell i-1.
* Move Forward:
	* If cell i+1 contains a zero, you can walk to cell i+1.
	* If cell i+leap contains a zero, you can jump to cell i+leap.
	* If you're standing in cell n-1 or the value of i+leap >= n, you can walk or jump off the end of the array and win the game.
In other words, you can move from index i to index i+1, i-1, or i+leap as long as the destination index is a cell containing a 0. If the destination index is greater than n-1, you win the game.

Given leap and game, complete the function in the editor below so that it returns true if you can win the game (or false if you cannot).

 */

public class OneDArray2 {

	public static boolean canWin(int leap, int[] game) {
	    return move(leap, game, 0);
	}

	private static boolean move(int leap, int[] game, int i) {

	    if (i >= game.length) {
	        return true;
	    } else if (i < 0 || game[i] == 1) {
	        return false;
	    }
	            
	    game[i] = 1;

	    return move(leap, game, i + leap) || 
	    		move(leap, game, i + 1) || 
	    		move(leap, game, i - 1);
	}

/*	public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
        int pos = 0;
        int size = game.length;
        
        while (pos < size) {
            game[pos] = 1;
            if ((pos == (size-1)) || (pos + leap) >= size) {
                return true;
            }

            if (game[pos + leap] == 0) {
                pos = pos + leap;
                continue;
            }
            
            if ((pos + 1) < size && game[pos + 1] == 0) {
                pos = pos + 1;
                continue;
            }
            
            if ((pos - 1) > 0 && game[pos + 1] == 0) {
                pos = pos -1;
                continue;
            }
            break;
        }
        return false;
    }*/
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println("Query : " + q);
            System.out.println("Game : " + Arrays.toString(game));
            System.out.println("Size : " + n);
            System.out.println("Leap : " + leap);
            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
