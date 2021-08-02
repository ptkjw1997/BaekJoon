package Main;

import java.util.*;
import java.io.*;


public class Main {
	static double[][] comb_set = new double[41][41];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		int cnt = 0;
		
		while(N-- >0) {
			if(is_prime(Integer.parseInt(line[N]))) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
	
	private static boolean is_prime(int N) {
		if (N==1) return false;
		for(int i = 2; i <= Math.sqrt(N); i++) {
			if(N%i == 0) {
				return false;
			}
		}
		return true;
		
	}
}