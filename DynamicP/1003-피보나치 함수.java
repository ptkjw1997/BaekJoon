package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
			
		long[] result = new long[41];
		result[0] = result[1] = 1;
		
		
		for(int i = 2; i < 41; i++) {
			result[i] = result[i-1] + result[i-2];
		}
		
		while(N-- > 0) {
			int a = Integer.parseInt(br.readLine());
			if ( a == 0) {
				System.out.println("1 0");
			} else if (a == 1) {
				System.out.println("0 1");
			} else {
				System.out.println(result[a-2] + " " + result[a-1]);
			}
			
		}
		
	}
	
}
