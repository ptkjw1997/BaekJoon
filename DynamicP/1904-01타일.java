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
		
		int num = Integer.parseInt(br.readLine());
		
		int[] DP = new int[(num+1 > 3) ? num+1 : 3];
		
		DP[0] = 0;
		DP[1] = 1;
		DP[2] = 2;
		
		for(int i = 3; i < num+1; i++) {
			DP[i] = (DP[i-2] + DP[i-1]) % 15746;
		}
		
		System.out.println(DP[num]);
		
	}
	
}
