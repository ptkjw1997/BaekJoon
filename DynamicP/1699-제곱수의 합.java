package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	static int[][] DP = new int[31][31];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int num = Integer.parseInt(br.readLine());
		
		int[] DP = new int[(num+1 > 10) ? num+1 : 10];
		
		Arrays.fill(DP, Integer.MAX_VALUE);
		DP[0] = 0;
		DP[1] = 1;
		DP[2] = 2;
		DP[3] = 3;
		DP[4] = 1;
		
		
		for(int i = 5; i < num+1; i++) {
			for(int j = sqrt(i); j >= 1; j--) {
				DP[i] = (DP[i-j*j] +1 < DP[i]) ? DP[i-j*j] +1 : DP[i]; 
			}
		}
		
		System.out.println(DP[num]);
		
	}
	
	private static int sqrt(int n) {
		return (int)Math.floor(Math.sqrt(n));
	}
	
	
}