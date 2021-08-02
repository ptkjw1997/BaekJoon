package Main;

import java.util.*;
import java.io.*;


public class Main {
	static double[][] comb_set = new double[41][41];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] res = new int[42];
		
		for(int i = 0; i < 10; i++) {
			res[Integer.parseInt(br.readLine())%42]++;
		}
		
		int sum = 0;
		for(int i = 0; i < 42; i++) {
			sum += (res[i] > 0 ) ? 1 : 0;
		}
		
		System.out.println(sum);
		
		
	}
}