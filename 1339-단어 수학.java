package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Integer N = Integer.parseInt(br.readLine());
		String[] set = new String[N];
		int[] value = new int[26];
		int[] score = new int[26];
		
		for(int i = 0; i < N; i++) {
			set[i] = br.readLine();
			for(int j = 0; j < set[i].length(); j++) {
				value[set[i].charAt(j) - 'A'] += Math.pow(10, set[i].length() - j - 1);
			}
		}
		
		Arrays.sort(value);
		
		int val = 9, res = 0;
		for(int i = value.length - 1; i >= 0; i--) {
			if(value[i] == 0) {
				break;
			}
			res += value[i] * val;
			val--;
		}
		
		System.out.println(res);
	}
}

