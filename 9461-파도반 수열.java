package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		long[] DP = new long[101];
		
		DP[1] = DP[2] = DP[3] = 1;
		DP[4] = DP[5] = 2;
		DP[6] = 3;
		DP[7] = 4;
		DP[8] = 5;
		DP[9] = 7;
		DP[10] = 9;
		
		for(int i = 11; i < 101; i++) {
			DP[i] = (DP[i-1] + DP[i-5]);
		}
		
		while(num-- > 0) {
			int n = Integer.parseInt(br.readLine());
			System.out.println(DP[n]);
		}
		
	}
	
}