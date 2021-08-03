package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		while(N-- >0) {
			String[] line = br.readLine().split(" ");
			int from = Integer.parseInt(line[0]), to = Integer.parseInt(line[1]);
			int dist = to - from;
			int ans = get_ans(dist);
			int res = 2*ans - 1;
			if(dist <= (ans-1)*(ans-1) + (ans-1)) {
				res -= 1;
			}
			System.out.println(res);
			
		}
	}
	
	private static int get_ans(int dist) {
		int n = (int)Math.ceil(Math.sqrt(dist));
		return n;
	}
}