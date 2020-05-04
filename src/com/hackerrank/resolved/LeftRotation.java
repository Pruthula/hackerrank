package com.hackerrank.resolved;

import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/array-left-rotation/problem
 */
public class LeftRotation {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            //a[i] = aItem;
            a[(i+n-d)%n] = aItem; // Soln
        }

        scanner.close();
        
        /*reverseArray(a, d); -> is my approach, dint work for one use case due to time complexity O(nd)*/
        
        for (int i = 0; i < a.length; i++) {
        	System.out.print(a[i]);

            if (i != a.length - 1) {
            	System.out.print(" ");
            }
        }
    }

/*	private static void reverseArray(int arr[], int d) {
		int size = arr.length;
		
		int iteration = 1;
		while (iteration <= d) {
			for (int i=0; i< size -1; i++) {
				swap(arr, 0, size - 1 - i);
			}
			iteration++;
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}*/	
}
