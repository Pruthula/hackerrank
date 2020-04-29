package com.hackerrank.solved;

import java.util.Scanner;

public class Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] arr = new int[size];
		for (int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int count = 0;
		for (int i=0; i<size; i++) {
			if (arr[i] < 0) {
				count++;
			}
			int sum = arr[i];
			for (int j=i+1; j < size; j++) {
				sum = sum + arr[j];
				if (sum < 0) {
					count++;
				}
			}
				
		}
		System.out.println(count);
	}

}
