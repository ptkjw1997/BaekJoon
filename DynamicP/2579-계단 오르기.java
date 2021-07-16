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
		
		int[] score = new int[N+1];
		
		for(int i = 1; i < N+1; i++) {
			score[i] = Integer.parseInt(br.readLine());
		}
		
		int[][] DP = new int[N+1][2];
		DP[0][0] = DP[0][1] = 0;
		DP[1][0] = 0;
		DP[1][1] = score[1];
		
		for(int i = 2; i < N+1; i++) {
			if (i == 2) {
				DP[2][0] = score[2];
				DP[2][1] = score[1] + score[2];
			} else {
				DP[i][0] = Math.max(DP[i-2][0], DP[i-2][1]) + score[i];
				DP[i][1] = DP[i-1][0] + score[i];
			}
		}
		
		System.out.println(Math.max(DP[N][0], DP[N][1]));
		
	}
}
