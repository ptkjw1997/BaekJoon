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
		int[] array = new int[N];
		int[] DP = new int[N];
		
		String[] line = br.readLine().split(" ");
		
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(line[i]);
		}
		
		DP[0] = 1;
		int ans = 1;
		
		for(int i = 1; i < N; i++) {
			int max = 1;
			
			for(int j = 0; j < i; j++) {
				if(array[j] < array[i]) max = (DP[j]+1 > max) ? DP[j]+1 : max;
			}
			DP[i] = max;
			ans = (max > ans) ? max : ans;
		}
		for(int i = 0; i < N; i++) {
			System.out.println(DP[i]);
		}
		System.out.println(ans);
	}
}
