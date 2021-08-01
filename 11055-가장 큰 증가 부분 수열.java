package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	static int[][] DP = new int[31][31];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int num = Integer.parseInt(br.readLine());
		
		String[] line = br.readLine().split(" ");
		
		int[] array = new int[num+1];
		int[] DP = new int[num+1];
		
		for(int i = 0; i < num; i++) {
			array[i+1] = Integer.parseInt(line[i]);
		}
		
		DP[0] = 0;
		DP[1] = array[1];
		int max_val = array[1];
		
		for(int i = 2; i < num+1; i++) {
			DP[i] = array[i];
			for(int j = 1; j < i; j++) {
				if(array[j] < array[i]) {
					DP[i] = (DP[j] + array[i] > DP[i]) ? DP[j] + array[i] : DP[i];
					max_val = (DP[i] > max_val) ? DP[i] : max_val;
				}
			}
		}
		
		System.out.println(max_val);
		
	}
	
}