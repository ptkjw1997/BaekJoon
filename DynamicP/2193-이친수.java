package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		long[] DP = new long[91];
		
		DP[1] = 1;
		DP[2] = 1;
		// 100000 100001 100010 100100 100101 101000 101001 101010 
		for(int i = 3; i < num+1; i++) {
			long sum = 0;
			for(int j = 1; j < i-1; j++) {
				sum += DP[j];
			}
			DP[i] = sum + 1;
		}
		
		System.out.println(DP[num]);
	}
	
}