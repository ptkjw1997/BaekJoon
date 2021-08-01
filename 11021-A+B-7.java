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
		int a, b;
		String[] lines;
		for(int i = 1; i <= N; i++) {
			lines = br.readLine().split(" ");
			a = Integer.parseInt(lines[0]);
			b = Integer.parseInt(lines[1]);
			System.out.println("Case #" + i +": " + (a+b));
		}
		
	}
	
}

