package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	static int[][] DP = new int[1001][1001];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]), K = Integer.parseInt(line[1]);
		
		System.out.println(combination(N, K));
		
	}
	
	private static int combination(int n, int r) {
		if(DP[n][r] != 0) {
			return DP[n][r];
		} else {
			if(r == 0 | r == n) {
				return DP[n][r] = 1;
			} else {
				return DP[n][r] = (combination(n-1, r-1) + combination(n-1, r)) % 10007;
			}
		}
	}
	
}