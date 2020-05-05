package com.hackerrank.solved;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
 * https://www.hackerrank.com/challenges/dynamic-array/problem
 */
public class DynamicArray {

	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int q = Integer.parseInt(firstMultipleInput[1]);

        List<List<Integer>> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> queriesRowItems = new ArrayList<>();

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
                queriesRowItems.add(queriesItem);
            }

            queries.add(queriesRowItems);
        }

        List<Integer> result = Result.dynamicArray(n, queries);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
            	System.out.println("\n");
            }
        }
	}

}

class Result {

    /*
     * Complete the 'dynamicArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. 2D_INTEGER_ARRAY queries
     */

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {

    	List<List<Integer>> seqList = new ArrayList<>(n);
    	for (int i=0; i< n; i++) {
    		List<Integer> sequence = new ArrayList<>();
    		seqList.add(sequence);
    	}
    	List<Integer> result = new ArrayList<>();
    	int lastAnswer = 0;
    	
    	int queryCount = queries.size();
    	for (int i=0; i< queryCount; i++) {
    		List<Integer> query = queries.get(i);
    		
    		int queryType = query.get(0);
    		int x = query.get(1);
    		int y = query.get(2);
    		
    		int seqNum = (x ^ lastAnswer) % n;
			
    		if (queryType == 1) {
    			seqList.get(seqNum).add(y);
    		} else {
    			int index = (y % seqList.get(seqNum).size());
    			lastAnswer = seqList.get(seqNum).get(index);
    			result.add(lastAnswer);
    		}
    	}
    	
    	return result;
    }

}

