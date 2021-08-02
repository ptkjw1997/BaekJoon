package Main;

import java.util.*;
import java.io.*;


public class Main {
	static double[][] comb_set = new double[41][41];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		double a = Double.parseDouble(line[0]), b = Double.parseDouble(line[1]);
		if(a > b) {
			double dummy = a;
			a = b;
			b = dummy;
		}
		
		int N = Integer.parseInt(line[2]);
		double K = Double.parseDouble(line[3]);
		
		int R = 0;
		while(comb(N, R) < K) {
			K -= comb(N, R);
			R++;
		}
		
		double first = a*a/(a*a+b*b);
		double second = b*b/(a*a+b*b);
		double result = a * b * Math.pow(first, R) * Math.pow(second, N-R) / 2;
		System.out.println(Math.log(result));

	}
	
	private static double comb(int N, int R) {
		if(comb_set[N][R] != 0) return comb_set[N][R];
		if ( R == 0 | R == N) {
			return comb_set[N][R] = 1.0;
		} else {
			double a = comb(N-1, R-1);
			double b = comb(N-1, R);
			return comb_set[N][R] = a+b;
		}
	}
}