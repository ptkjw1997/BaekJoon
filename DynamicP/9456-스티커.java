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
		
		int testcase = Integer.parseInt(br.readLine());
		
		
		while(testcase-- > 0) {
			int sticker_num = Integer.parseInt(br.readLine());
			
			int[][] array = new int[2][sticker_num+1];
			int[][] DP = new int[2][sticker_num+1];
			
			for(int i = 0; i < 2; i++) {
				String[] line = br.readLine().split(" ");
				for(int j = 0; j < sticker_num; j++) {
					array[i][j+1] = Integer.parseInt(line[j]);
				}
			}
			
			DP[0][0] = DP[1][0] = 0;
			DP[0][1] = array[0][1];
			DP[1][1] = array[1][1];
			int max_val = -1;
			
			for(int i = 2; i < sticker_num+1; i++) {
				DP[0][i] = Math.max(DP[1][i-1], Math.max(DP[0][i-2], DP[1][i-2])) + array[0][i];
				DP[1][i] = Math.max(DP[0][i-1], Math.max(DP[0][i-2], DP[1][i-2])) + array[1][i];
				int temp_max = Math.max(DP[0][i], DP[1][i]);
				max_val = (temp_max > max_val) ? temp_max : max_val;
			}
			
			System.out.println(max_val);
			
		}
		
	}
}
