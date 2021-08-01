package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		long[][] DP = new long[101][10];
		
		for(int i = 0; i < 10 ; i++) {
			
			DP[1][i] = (i == 0) ? 0 : 1;
		}
		
		for(int i = 2; i < num+1; i++) {
			for(int j = 0; j < 10; j++) {
				if(j == 0 | j == 9) {
					DP[i][j] = (j == 0) ? DP[i-1][1] % 1000000000 : DP[i-1][8] % 1000000000;
				} else {
					DP[i][j] = (DP[i-1][j-1] + DP[i-1][j+1]) % 1000000000;
				}
			}
		}
		
		long ans = 0;
		for(int i = 0; i < 10; i++) {
			ans = (ans + DP[num][i]) % 1000000000;
		}
		System.out.println(ans);
	}
	
}