package Main;

import java.util.*;
import java.io.*;


public class Main {
	static double[][] comb_set = new double[41][41];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		long N = Integer.parseInt(line[0])+1, M = Integer.parseInt(line[1])+1, K = Integer.parseInt(line[2]);
		
		long lcm = get_lcm(N, M);
		long b = K / lcm;
		long c = K / M - b;
		long d = K / N - b;
		long a = K - b - c- d;
		System.out.println(a + " " + b + " " + c + " " + d);
	}
	
	private static long get_gcd(long N, long M) {
		long small = Math.min(N, M);
		long big = Math.max(N, M);
		if (big%small == 0) {
			return small;
		} else {
			return get_gcd(small, big-small);
		}
	}
	
	private static long get_lcm(long N, long M) {
		long gcd = get_gcd(N, M);
		return N*M/gcd;
	}
}