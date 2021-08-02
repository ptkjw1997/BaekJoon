package Main;

import java.util.*;
import java.io.*;


public class Main {
	static double[][] comb_set = new double[41][41];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = 5;
		int sum = 0;
		while(N-- >0) {
			int score = Integer.parseInt(br.readLine());
			sum += (score > 40) ? score : 40;
		}
		System.out.println(sum/5);
	}
}