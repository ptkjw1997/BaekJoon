package Main;

import java.util.*;
import java.io.*;


public class Main {
	static double[][] comb_set = new double[41][41];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		while(N-- >0) {
			String[] line = br.readLine().split(" ");
			int num = Integer.parseInt(line[0]);
			int sum = 0;
			
			for(int i = 1; i <= num; i++) {
				sum += Integer.parseInt(line[i]);
			}
			
			double mean = sum / num;
			double cnt = 0;
			
			for(int i = 1; i <= num; i++) {
				if(mean < Integer.parseInt(line[i])) {
					cnt++;
				}
			}
			
			double result = cnt * 100 / num;
			System.out.println(String.format("%.3f", result) + "%");
		}
		
		
		
	}
}