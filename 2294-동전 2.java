package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int num_coin = Integer.parseInt(line[0]), target = Integer.parseInt(line[1]);
		
		int[] coin = new int[num_coin+1];
		
		int[] DP = new int[target+1];
		Arrays.fill(DP, 10001);
		DP[0] = 0;
		
		for(int i = 1; i <= num_coin; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		for(int i = 1; i <= num_coin; i++) {
			for(int j = coin[i]; j <= target; j++) {
				DP[j] = Math.min(DP[j], DP[j-coin[i]]+1);
			}
		}
		
		System.out.println((DP[target] == 10001) ? -1 : DP[target]);
		
	}
}