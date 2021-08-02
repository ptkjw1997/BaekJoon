package Main;

import java.util.*;
import java.io.*;


public class Main {
	static double[][] comb_set = new double[41][41];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int to = Integer.parseInt(br.readLine());
		
		int n = 1;
		to--;
		while(to>0) {
			to -= 6*n;
			n++;
		}
		System.out.println(n);
	}
}