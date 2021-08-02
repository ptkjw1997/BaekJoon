package Main;

import java.util.*;
import java.io.*;


public class Main {
	static double[][] comb_set = new double[41][41];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(fact(N));
		
	}
	
	private static int fact(int N) {
		if (N <= 1) return 1;
		return N*fact(N-1);
	}
}