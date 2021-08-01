package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


import java.io.*;


public class Main {
	
	static long[] total;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N, Q;
		String[] line = br.readLine().split(" ");
		N = Integer.parseInt(line[0]);
		Q = Integer.parseInt(line[1]);
		total = new long[N+1];
		
		while(Q-->0){
			line = br.readLine().split(" ");
			int order = Integer.parseInt(line[0]);
			int day = Integer.parseInt(line[1]);
			int third = Integer.parseInt(line[2]);
			
			switch(order) {
			case 1 :
				total[day] += third;
				break;
			
			case 2 :
				System.out.println(cal(day, third));
				break;
			}
		}
		
	}
	
	private static long cal(int from, int to) {
		long delta = 0;
		for(int i = from ; i <= to; i++) {
			delta += total[i];
		}
		return delta;
		
	}
	
}

