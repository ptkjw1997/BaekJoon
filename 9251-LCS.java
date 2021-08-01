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
		
		String[] first_line = br.readLine().split("");
		String[] second_line = br.readLine().split("");
		int first_num = first_line.length, second_num = second_line.length;
		
		int[][] DP = new int[first_num+1][second_num+1];
		
		for(int i = 0; i < first_num+1; i++) {
			DP[i][0] = 0;
		}
		
		for(int j = 0; j < second_num+1; j++) {
			DP[0][j] = 0;
		}
		
		for(int i = 1; i < first_num+1; i++) {
			for(int j = 1; j < second_num+1; j++) {
				if(first_line[i-1].equals(second_line[j-1])) {
					DP[i][j] = DP[i-1][j-1] +1;
				}
				else {
					DP[i][j] = Math.max(DP[i-1][j], DP[i][j-1]);
				}
			}
		}
		
		System.out.println(DP[first_num][second_num]);
	}
	
}
