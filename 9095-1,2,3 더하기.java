package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] result = new int[12];
		
		result[1] = 1;
		result[2] = 2;
		result[3] = 4;
		
		for(int i = 4; i < 12; i++) {
			result[i] = result[i-2] + result[i-1] + result[i-3];
		}
		
		while(N-- >0) {
			int a = Integer.parseInt(br.readLine()); 
			System.out.println(result[a]);
		}
		
	}
	
}
