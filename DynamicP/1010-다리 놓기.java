package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	static int[][] DP = new int[31][31];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int Test_case = Integer.parseInt(br.readLine());
		
		
		while(Test_case-- > 0) {
			String[] line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]), b = Integer.parseInt(line[1]);
			
			System.out.println(solve(b, a));
		}
		
		
	}
	
	private static int solve(int N, int R) {
		if(N == R) return DP[N][R] = 1;
		if(R == 0) return DP[N][R] = 1;
		
		if(DP[N][R] != 0 ) return DP[N][R];
		else {
			return DP[N][R] = solve(N-1, R) + solve(N-1, R-1);
		}
		
	}
	
	
}