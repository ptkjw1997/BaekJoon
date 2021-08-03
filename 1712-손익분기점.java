package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		double fix = Double.parseDouble(line[0]), var = Double.parseDouble(line[1]), price = Double.parseDouble(line[2]);
		
		if (var >= price) {
			System.out.println(-1);
		} else {
			double sol = fix / (price - var);
			int res = (int)(Math.floor(sol) + 1);
			System.out.println(res);
		}
		
		
	}
}