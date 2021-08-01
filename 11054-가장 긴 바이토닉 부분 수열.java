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
		array[0] = 0;
		for(int i = 0; i < num; i++) {
			array[i+1] = Integer.parseInt(line[i]);
		}
		
		int[] DP_i = new int[num+1];
		int[] DP_d = new int[num+2];
		int max_val = 0;
		Arrays.fill(DP_i, 1);
		Arrays.fill(DP_d, 1);
		
		DP_i[0] = 0;
		DP_d[num+1] = 0;
		
		for(int i = 1; i < num+1; i++) {
			for(int j = 1; j < i; j++) {
				if(array[i] > array[j]) {
					DP_i[i] = ( DP_i[j] + 1 > DP_i[i] ) ? DP_i[j]+1 : DP_i[i];
				}
				
				if(array[num-i+1] > array[num-j+1]) {
					DP_d[num-i+1] = ( DP_d[num-j+1] + 1 > DP_d[num-i+1] ) ? DP_d[num-j+1]+1 : DP_d[num-i+1];
				}
			}
		}
		for(int i = 1 ; i < num+1; i++) {
			max_val = (DP_i[i] + DP_d[i] > max_val) ? DP_i[i]+DP_d[i] : max_val;
		}
		
		System.out.println(max_val-1);
		
				
	}
	
	
}