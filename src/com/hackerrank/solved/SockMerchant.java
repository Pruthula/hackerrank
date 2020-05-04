package com.hackerrank.solved;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class SockMerchant {

/*
This Solution provided using HashMap is good but better would be to use a HashSet.
HashMap - O(2n)
HashSet - O(n)
	
	
	static int sockMerchant(int n, int[] ar) {
	    Set<Integer> colors = new HashSet<>();
	    int pairs = 0;

	    for (int i = 0; i < n; i++) {
	        if (!colors.contains(ar[i])) {
	            colors.add(ar[i]);
	        } else {
	            pairs++;
	            colors.remove(ar[i]);
	        }
	    }
	    return pairs;
	}
*/	
	
	static int sockMerchant(int n, int[] ar) {

		Map<Integer, Integer> collection = new HashMap<>();

		for (int i = 0; i < n; i++) {
			int count = 0;
			if (collection.containsKey(ar[i])) {
				count = collection.get(ar[i]);
			}
			collection.put(ar[i], ++count);
		}

		int result = 0;
		for (int key : collection.keySet()) {
			result = result + (collection.get(key) / 2);
		}
		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		System.out.println(result);
		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

		scanner.close();
	}
}
