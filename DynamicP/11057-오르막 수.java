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
		
		int num = Integer.parseInt(br.readLine());
		
		int[][] DP = new int[1001][10];
		
		for(int i = 0; i < 10; i++) {
			DP[0][i] = 0;
			DP[1][i] = 1;
		}
		
		for(int i = 2; i < num+1; i++) {
			int sum = 0;
			for(int j = 0; j < 10; j++) {
				sum += DP[i-1][j];
				DP[i][j] = sum % 10007;
			}
		}
		
		
		int result = 0;
		for(int i = 0; i < 10; i++) {
			result = (result + DP[num][i]) % 10007;
		}
		
		
		System.out.println(result);
	}
	
}
