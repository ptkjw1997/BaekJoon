package Main;

import java.util.*;
import java.io.*;


public class Main {
	static double[][] comb_set = new double[41][41];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int num_3 = N/3;
		while((N-num_3*3)%2 != 0) {
			num_3--;
		}
		int num_4 = (N-num_3*3)/4;
		int num_2 = ((N-num_3*3)%4 == 2) ? 1 : 0;
		
		System.out.println(num_2 + 7*num_3 + 4*num_4);
		/*
		 * 0 : 6 -> 7 7
		 * 1 : 2
		 * 2 : 5 -> 7 1
		 * 3 : 5 -> 7 1
		 * 4 : 4 
		 * 5 : 5 -> 7 1
		 * 6 : 6 -> 7 7
		 * 7 : 3
		 * 8 : 7 -> 7 4
		 * 9 : 6 -> 7 7
		 * 
		 * use 1, 4, 7 each 2 4 3
		 * 
		 */
		
	}
}