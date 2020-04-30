package com.hackerrank.solved;

import java.io.IOException;
import java.util.Scanner;

public class ReverseArray {

    static int[] reverseArray(int[] a) {

		if (a != null && a.length > 0) {
			int size = a.length;
			int mid = size / 2;
			for (int i = 0, j = (size - 1); i < mid; i++, j--) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
    	return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	
        int arrCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arrCount; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] res = reverseArray(arr);

        for (int i = 0; i < res.length; i++) {
        	System.out.print(res[i]);

            if (i != res.length - 1) {
            	System.out.print(" ");
            }
        }

        scanner.close();
    }


}
