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
		
		int num_card = Integer.parseInt(br.readLine());
		
		int[] price = new int[num_card+1];
		String[] line = br.readLine().split(" ");
		
		for(int i = 0 ; i < num_card; i++) {
			price[i+1] = Integer.parseInt(line[i]);
		}
		
		int[] DP = new int[num_card+1]; // DP[i] = i 장 사는 데 필요한 Max Price
		
		DP[1] = price[1];
		for(int i = 2; i < num_card+1; i++) {
			DP[i] = -1;
			for(int j = 1; j < i; j++) {
				DP[i] = (DP[i] < DP[j] + DP[i-j] ) ? DP[j]+DP[i-j] : DP[i];
			}
;			DP[i] = Math.max(DP[i], price[i]);
		}
		for(int i = 1; i<num_card+1;i++) {
			System.out.print(DP[i] + " ");
		}
		System.out.println("");
		System.out.println(DP[num_card]);
		
		
		
	}
}
