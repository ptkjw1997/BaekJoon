package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int result = (N%4 == 0) ? (N%100 != 0 | N%400 == 0) ? 1 : 0 : 0;
		System.out.println(result);
	}
}
