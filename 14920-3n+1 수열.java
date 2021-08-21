package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		long N = Long.parseLong(br.readLine());
		
		int result = 1;
		while(N != 1) {
			if( (N & 1) == 1 ) {
				N = 3 * N + 1;
				result++;
			}
			while( (N & 1) == 0 ) {
				N /= 2;
				result++;
			}
		}
		
		System.out.println(result);
		
	}
}

