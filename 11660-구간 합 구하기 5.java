package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		
		int N = Integer.parseInt(line[0]), M = Integer.parseInt(line[1]);
		
		int[][] array = new int[N+1][N+1];
		int[][] DP = new int[N+1][N+1];
		
		for(int i = 0; i < N; i++) {
			line = br.readLine().split(" ");
			for(int j = 0; j < N; j++) {
				array[i+1][j+1] = Integer.parseInt(line[j]);
			}
		}
		
		for(int i = 0; i< N+1; i++) {
			for(int j = 0; j < N+1; j++) {
				DP[i][j] = 0;
			}
		}
		
		for(int i = 1; i < N+1; i++) {
			for(int j = 1; j < N+1; j++) {
				if(i==1 | j ==1) {
					if(i+j == 2) DP[i][j] = array[i][j];
					else if (i == 1) DP[i][j] = DP[i][j-1] + array[i][j];
					else DP[i][j] = DP[i-1][j] + array[i][j];
				} else {
					DP[i][j] = DP[i-1][j] + DP[i][j-1] - DP[i-1][j-1] + array[i][j];
				}
			}
		}
		
		
		while(M-- > 0) {
			line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]), b = Integer.parseInt(line[1]), c = Integer.parseInt(line[2]), d = Integer.parseInt(line[3]);
			System.out.println(DP[c][d] - DP[c][b-1] - DP[a-1][d] + DP[a-1][b-1]);
		}
		
	}
	
}
