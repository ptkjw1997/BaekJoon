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
		
		int N = Integer.parseInt(br.readLine());
		while(N-- > 0) {
			System.out.println(solve(br.readLine()));
		}
		
	}
	
	private static long solve(String str) {
		long num = Long.parseLong(str);
		long result = 0;
		
		result += (num + 1)/2;
		
		result += ( (num + 1)/2 - (num + 2)/6 ); 
		
		return result;
	}
}

