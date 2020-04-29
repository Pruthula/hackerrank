package com.hackerrank.practice;

import java.util.BitSet;
import java.util.Scanner;

/*
 * https://www.hackerrank.com/challenges/java-bitset/problem
 */

public class JavaBitSet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
	    int opCount = sc.nextInt();
	    
        BitSet set1 = new BitSet(size);
        BitSet set2 = new BitSet(size);
        
        for (int i=0; i< opCount; i++) {
        	String operation = sc.next();
        	int setNumber = sc.nextInt();
        	int bitIndex = sc.nextInt();
        	
        	switch(operation) {
        	
        	case "AND": 
        		if (setNumber == 1) {
        			set1.and(set2);
        		} else {
        			set2.and(set1);
        		}
        		System.out.println(set1.cardinality() + " " + set2.cardinality());
        		break;
        	
        	case "OR":
        		if (setNumber == 1) {
        			set1.or(set2);
        		} else {
        			set2.or(set1);
        		}
        		System.out.println(set1.cardinality() + " " + set2.cardinality());
        		break;
        		
        	case "XOR":
        		if (setNumber == 1) {
        			set1.xor(set2);
        		} else {
        			set2.xor(set1);
        		}
        		System.out.println(set1.cardinality() + " " + set2.cardinality());
        		break;
        		
        	case "SET":
        		if (setNumber == 1) {
        			set1.set(bitIndex);
        		} else {
        			set2.set(bitIndex);
        		}
        		System.out.println(set1.cardinality() + " " + set2.cardinality());
        		break;
        	
        	case "FLIP":
        		if (setNumber == 1) {
        			set1.flip(bitIndex);
        		} else {
        			set2.flip(bitIndex);
        		}
        		System.out.println(set1.cardinality() + " " + set2.cardinality());
        		break;
        	
        	default:
        		System.out.println("Invalid Operation");
        	}
        	
        }
        sc.close();
    }
}
