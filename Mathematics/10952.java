package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		while(true) {
			String[] line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]), b = Integer.parseInt(line[1]);
			
			if (a == 0 & b == 0) break;
			
			System.out.println(a+b);
		}
		
		
	}
	
}
