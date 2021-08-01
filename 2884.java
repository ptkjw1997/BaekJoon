package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] line = br.readLine().split(" ");
		int H = Integer.parseInt(line[0]), M = Integer.parseInt(line[1]);
		
		if (M >= 45) {
			M -= 45;
		} else {
			M +=15;
			H = (H!=0) ? (H-1) : 23;
		}
		System.out.println(H + " " + M);
	}
	
}
