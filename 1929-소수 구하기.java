package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int M = Integer.parseInt(line[0]);
		int N = Integer.parseInt(line[1]);
		
		for(int i= M; i <= N; i++) {
			if(is_prime(i)) {
				System.out.println(i);
			}
		}
		
	}
	
	private static boolean is_prime(int N) {
		if (N == 1) return false;
		for(int i = 2; i <= Math.sqrt(N); i++) {
			if(N%i == 0) {
				return false;
			}
		}
		return true;
	}
}