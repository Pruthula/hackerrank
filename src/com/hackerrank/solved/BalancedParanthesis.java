package com.hackerrank.solved;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class BalancedParanthesis {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
    	
    	Stack<Character> stack = new Stack<>();

    	char[] charArray = s.toCharArray();
    	for (int i=0; i < s.length(); i++) {

			if (stack.isEmpty()) {
				stack.push(charArray[i]);
			} else {
				char ip =charArray[i];
				char item = stack.peek();
				if (ip == '(' || ip == '{' || ip == '[') {
					stack.push(ip);
				} else if ((ip==')' && item == '(') || (ip=='}' && item == '{') || (ip==']' && item == '[')) {
					stack.pop();
				} else {
					stack.push(ip);
				}
			}
		}
    	return stack.isEmpty()? "YES":"NO";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            System.out.println(isBalanced(s));
        }

        scanner.close();
    }
    
}
