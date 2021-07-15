package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] DP = new int[N+1];
		
		for(int i = 1; i < N+1; i++) {
			if (i == 1) {
				DP[i] = 1;
			} else if (i == 2){
				DP[i] = 2;
			} else {
				DP[i] = (DP[i-2] + DP[i-1]) % 10007;
			}
		}
		
		System.out.println(DP[N]);
	}
	
}
