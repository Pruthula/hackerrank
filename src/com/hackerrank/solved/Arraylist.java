package com.hackerrank.solved;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist {
	public static void main(String[] args) {
		
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();
		
		Scanner sc = new Scanner(System.in);
		int inputs = sc.nextInt();
		
		// Collect the arrays
		for (int i=0; i< inputs; i++) {
			int size = sc.nextInt();

			ArrayList<Integer> arr= new ArrayList<Integer>();
			for (int j=0; j< size; j++) {
				int input = sc.nextInt();
				arr.add(j, input);
			}
			a.add(i, arr);
		}
		
		int queries = sc.nextInt();
		for (int i=0; i< queries; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			try {
				System.out.println(a.get(x-1).get(y-1));
			} catch (Exception e) {
				System.out.println("ERROR!");
			}
		}
		sc.close();
	}
}
