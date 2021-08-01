package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int R1 = Integer.parseInt(line[0]);
		int S = Integer.parseInt(line[1]);
		
		System.out.println(2*S - R1);
		
	}
}