package com.hackerrank.solved;

import java.util.Scanner;

public class SortArrayMinSwaps {

	private static final Scanner scanner = new Scanner(System.in);
		
	public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);
        
        scanner.close();
	}

	private static int minimumSwaps(int[] arr) {


	}
}
