package Main;

import java.util.*;
import java.io.*;


public class Main {
	static double[][] comb_set = new double[41][41];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line;
		while((line = br.readLine()) != null) {
			String[] lines = line.split(" ");
			int a = Integer.parseInt(lines[0]);
			int b = Integer.parseInt(lines[1]);
			System.out.println(a+b);
		}
	}
}