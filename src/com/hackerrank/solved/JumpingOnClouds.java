package com.hackerrank.solved;

import java.io.IOException;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class JumpingOnClouds {
	
	static int jumpingOnClouds(int[] c) {
		return Math.min(countJumps(c.length, c, 1), countJumps(c.length, c, 2));
    }

    private static int countJumps(int length, int[] c, int i) {
		if(i== length-1) {
			return 1;
		}
		
		if(i == length) {
			return 1;
		}
		
		if (c[i] == 1) {
			return Integer.MAX_VALUE;
		}
		
		return 1 + Math.min(countJumps(c.length, c, i+1), countJumps(c.length, c, i+2));
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        int result = jumpingOnClouds(c);

        System.out.println(result);

        scanner.close();
    }
}
