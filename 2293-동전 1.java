package Main;

import java.util.*;

import java.io.*;


public class Main {
	
	static int[][] DP = new int[31][31];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int num_coin = Integer.parseInt(line[0]), target_val = Integer.parseInt(line[1]);
		
		int[] value = new int[num_coin+1];
		for(int i = 0; i < num_coin; i++) {
			value[i+1] = Integer.parseInt(br.readLine());
		}
		
		int[] DP = new int[target_val+1];
		
		Arrays.fill(DP, 0);
		DP[0] = 1;
		
		for(int i = 1; i < num_coin+1; i++) {
			for(int j = value[i]; j < target_val+1; j++) {
				DP[j] = DP[j] + DP[j-value[i]];
			}
		}
		
		System.out.println(DP[target_val]);
	}
	
	
}