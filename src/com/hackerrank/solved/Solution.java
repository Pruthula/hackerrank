package com.hackerrank.solved;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		
		Map<String, Integer> directory = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			directory.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String name = in.nextLine();
			
			if (directory.containsKey(name)) {
				int phone = directory.get(name);
				System.out.println(name + "=" + phone);
			} else {
				System.out.println("Not found");
			}
		}
		in.close();
	}
}
