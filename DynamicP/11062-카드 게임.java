package baekjoon;/*
 * import java.io.*
 * import java.utils.*
 * 
 * Scanner sc = new Scanner(System.in)
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
 * 
 * sc.nextLine()
 * br.readLine()
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int case_num = Integer.parseInt(br.readLine());
		
		while(case_num-- > 0) {
			int N = Integer.parseInt(br.readLine());
			String[] lines = br.readLine().split(" ");
			
			int[] array = new int[N+1];
			array[0] = 0;
			
			for(int i = 1; i < N+1 ; i++) {
				array[i] = Integer.parseInt(lines[i-1]);
			}
			
			
			int[][][] DP = new int[N+1][N+1][2];
			
			for(int i = 0; i < N+1; i++) {
				DP[i][i][0] = array[i];
				DP[i][i][1] = 0;
				for(int j = 0; j < i; j++) {
					DP[i][j][0] = DP[i][j][1] = 0;
				}
			}
			
			for(int j = 1; j < N+1; j++) {
				for(int i = 1; i < N+1-j; i++) {
					DP[i][i+j][0] = Math.max(DP[i+1][i+j][1] + array[i], DP[i][i+j-1][1] + array[i+j]);
					DP[i][i+j][1] = Math.min(DP[i+1][i+j][0] , DP[i][i+j-1][0] );
				}
			}
			
			System.out.println(DP[1][N][0]);
			
		}
		
	}
}
