package Main;

import java.util.*;
import java.io.*;


public class Main {
	static double[][] comb_set = new double[41][41];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split("");
		int res = 0;
		while(N-- >0) {
			res += Integer.parseInt(line[N]);
		}
		
		System.out.println(res);
	}
}