package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine());
		String B = br.readLine();
		
		System.out.println(A * (B.charAt(2) -48));
		System.out.println(A * (B.charAt(1) -48));
		System.out.println(A * (B.charAt(0) -48));
		System.out.println(A * Integer.parseInt(B));
		
	}
}
