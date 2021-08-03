package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		
		double A = Integer.parseInt(line[0]), B = Integer.parseInt(line[1]), V = Integer.parseInt(line[2]);
		
		System.out.println((int)(Math.ceil((V-A)/(A-B)) + 1));
		
	}
}