package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
		while(N-- >0) {
			String[] line = br.readLine().split(",");
			int A = Integer.parseInt(line[0]), B = Integer.parseInt(line[1]);
			System.out.println(get_lcm(A, B));
		}
		
	}
	
	private static int get_gcd(int A, int B) {
		int max = Math.max(A, B);
		int min = Math.min(A, B);
		
		if(max%min == 0) return min;
		return get_gcd(max-min, min);
	}
	
	private static int get_lcm(int A, int B) {
		int gcd = get_gcd(A, B);
		return A*B/gcd;
	}
}