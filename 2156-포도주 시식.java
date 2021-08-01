package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		int[] array = new int[num+1];
		
		for(int i = 0; i < num ; i++) {
			array[i+1] = Integer.parseInt(br.readLine());
		}
		
		int[][] DP = new int[num+1][2];
		
		DP[0][0] = DP[0][1] = 0;
		
		DP[1][0] = 0;
		DP[1][1] = array[1];
		
		int result = Math.max(DP[1][0], DP[1][1]);
		
		for(int i = 2; i < num+1 ; i++) {
			if(i==2) {
				DP[i][0] = array[2];
				DP[i][1] = array[1] + array[2];
			} else {
				DP[i][0] = Math.max(Math.max(DP[i-2][0], DP[i-2][1]), Math.max(DP[i-3][0], DP[i-3][1])) + array[i];
				DP[i][1] = DP[i-1][0] + array[i];
			}
			
			result = (Math.max(DP[i][0], DP[i][1]) > result ) ? Math.max(DP[i][0], DP[i][1]) : result;
		}
		
		System.out.println(result);
	}
	
}