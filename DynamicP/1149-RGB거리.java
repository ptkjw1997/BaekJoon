package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] cost = new int[N+1][N+1];
		int[][] DP = new int[N+1][N+1];
		
		for(int i = 1; i < N+1; i++) {
			String[] line = br.readLine().split(" ");
			
			cost[i][0] = Integer.parseInt(line[0]);
			cost[i][1] = Integer.parseInt(line[1]);
			cost[i][2] = Integer.parseInt(line[2]);
			
		}
		
		DP[0][0] = DP[0][1] = DP[0][2] = 0;
		
		for(int i = 1; i < N+1; i++) {
			DP[i][0] = Math.min(DP[i-1][1], DP[i-1][2]) + cost[i][0];
			DP[i][1] = Math.min(DP[i-1][0], DP[i-1][2]) + cost[i][1];
			DP[i][2] = Math.min(DP[i-1][0], DP[i-1][1]) + cost[i][2];
		}
		
		int result = Math.min(DP[N][0], Math.min(DP[N][1], DP[N][2]));
		System.out.println(result);
	}
	
}
