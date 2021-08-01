package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int min = N;
		int sum = 0;
		for(int i= M; i <= N; i++) {
			if(is_prime(i)) {
				sum += i;
				if(i < min) min = i;
			}
		}
		if(sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
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