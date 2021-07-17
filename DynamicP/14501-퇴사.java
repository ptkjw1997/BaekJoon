package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		int[] T = new int[16];
		int[] P = new int[16];
		int[] DP = new int[30];
		
		
		for(int i = 0; i < num ; i++) {
			String[] line = br.readLine().split(" ");
			
			T[i+1] = Integer.parseInt(line[0]);
			P[i+1] = Integer.parseInt(line[1]);
		}
		
		T[0] = P[0] = 0;
		
		Arrays.fill(DP, 0);
		
		for(int i = num; i > 0; i--) {
			if(i + T[i] > num + 1) DP[i] = DP[i+1];
			else {
				DP[i] = Math.max(DP[i+1], P[i] + DP[i+T[i]]);
			}
		}
		System.out.println(DP[1]);
		
		
		
	}
	
	
}