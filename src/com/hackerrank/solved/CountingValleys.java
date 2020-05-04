package com.hackerrank.solved;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/*
 * https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class CountingValleys {
	
    // Complete the countingValleys function below.
	static int countingValleys(int n, String s) {

		Stack<Character> trackTrace = new Stack<>();

		int valleys = 0;
		char[] track = s.toCharArray();
		for (char step : track) {
			if (trackTrace.isEmpty()) {
				if (step == 'D' || step == 'd') {
					valleys++;
				}
				trackTrace.push(step);
			} else {
				char item = trackTrace.peek();
				if (item == 'U' || item == 'u') {
					if (step == 'D' || step == 'd') {
						trackTrace.pop();
					} else {
						trackTrace.push(step);
					}
				} else if (item == 'D' || item == 'd') {
					if ((step == 'U' || step == 'u')) {
						trackTrace.pop();
					} else {
						trackTrace.push(step);
					}
				}
			}
		}
		return valleys;
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        System.out.println(result);

        scanner.close();
    }
}
