package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]), M = Integer.parseInt(line[1]);
		
		int[] array = new int[M];
		int[] DP = new int[M];
		
		for(int i = 0; i<N; i++) {
			line = br.readLine().split(" ");
			for(int j = 0; j<M; j++) {
				array[j] = Integer.parseInt(line[j]);
				DP[j] = Math.max(DP[j], (j>=1)?DP[j-1]:0) + array[j];
			}
			
		}
		
		System.out.println(DP[M-1]);
	}	
}
