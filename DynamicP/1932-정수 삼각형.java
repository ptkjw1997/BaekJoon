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
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] nums = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			String[] line = br.readLine().split(" ");
			for(int j = 0 ; j <= i; j++) {
				nums[i][j] = Integer.parseInt(line[j]);
			}
		}
		
		int[][] DP = new int[N][N];
		
		DP[0][0] = nums[0][0];
		
		for(int i = 1; i < N; i++) {
			for(int j = 0; j <= i; j++) {
				if(j == 0 | j == i) {
					DP[i][j] = (j == 0) ? DP[i-1][j] + nums[i][j] : DP[i-1][j-1] + nums[i][j];
				} else {
					DP[i][j] = Math.max(DP[i-1][j-1], DP[i-1][j]) + nums[i][j];
				}
			}
		}
		
		int result = -1;
		for(int i = 0; i < N ; i++) {
			if (DP[N-1][i] > result) {
				result = DP[N-1][i];
			}
		}
		
		System.out.println(result);
	}
}
