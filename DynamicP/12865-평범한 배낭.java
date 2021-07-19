package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	static int[][] DP = new int[31][31];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]), K = Integer.parseInt(line[1]);
		
		int[] weigh = new int[N+1];
		int[] value = new int[N+1];
		
		Arrays.fill(weigh, 0);
		Arrays.fill(value, 0);
		
		for(int i = 0; i < N; i++) {
			line = br.readLine().split(" ");
			weigh[i+1] = Integer.parseInt(line[0]);
			value[i+1] = Integer.parseInt(line[1]);
		}
		
		int[][] DP = new int[N+1][K+1]; // DP[i][j] 는 1 ~ i 번째 물건 만 이용해서 무게가 j인 배낭에 넣을 수 있는 최대값
		
		for(int i = 1; i < N+1; i++) {
			for(int j = 1; j < K+1; j++) {
				if(j - weigh[i] >= 0) {
					DP[i][j] = Math.max(DP[i-1][j], DP[i-1][j-weigh[i]] + value[i]);
				} else {
					DP[i][j] = DP[i-1][j];
				}
			}
		}
		
		System.out.println(DP[N][K]);
	}
	
}