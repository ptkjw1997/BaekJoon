package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] DP = new int[31];
		
		DP[1] = 0;
		DP[2] = 3;
		
		for(int i = 3; i < N+1; i++) {
			int j = i-2;
			DP[i] = (i%2 == 0) ? 2 : 0;
			while(j >= 0) {
				if(j == i-2) {
					DP[i] += 3*DP[j];
				} else {
					DP[i] += 2*DP[j];
				}
				j -=2;
			}
		}
		System.out.println(DP[N]);
	}
}