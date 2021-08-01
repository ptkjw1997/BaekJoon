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
		int Max = Integer.MIN_VALUE;
		int Min = Integer.MAX_VALUE;
		String[] line = br.readLine().split(" ");
		
		for(int i = 0; i < N; i++) {
			if(Integer.parseInt(line[i]) > Max) {
				Max = Integer.parseInt(line[i]);
			} 
			if (Integer.parseInt(line[i]) < Min) {
				Min = Integer.parseInt(line[i]);
			}
		}
		
		System.out.println(Min + " " + Max);
		
	}
	
}

