package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] DP = new int[N+1];
		
		DP[1] = 0;
		for(int i = 2; i < N+1; i++) {
			if(i <= 3) {
				DP[i] = 1;
			} else {
				if(i%3 == 0 & i%2 == 0) {
					DP[i] = Math.min(DP[i/3], Math.min(DP[i/2], DP[i-1])) +1;
				} else if (i%3 == 0) {
					DP[i] = Math.min(DP[i/3], DP[i-1]) + 1;
				} else if (i%2 == 0) {
					DP[i] = Math.min(DP[i/2], DP[i-1]) +1;
				} else {
					DP[i] = DP[i-1] + 1;
				}
			}	
		}
		
		System.out.println(DP[N]);
		
	}
	
}
