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
		
		
		int[] DP = new int[21];
		
		DP[0] = 0;
		DP[1] = 1;
		
		for(int i = 2; i < 21; i++) {
			DP[i] = DP[i-1] + DP[i-2];
		}
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(DP[N]);
		
	}
}
