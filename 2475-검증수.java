package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int total = 0;
		for(int i = 0; i < 5; i++) {
			total += Math.pow(Integer.parseInt(line[i]), 2);
		}
		System.out.println(total % 10);
	}
}