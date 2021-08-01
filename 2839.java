package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int num_5 = N/5;
		
		while((N - num_5 * 5)%3 != 0) {
			num_5--;
		}
		
		if(num_5 == -1) {
			System.out.println(-1);
		} else {
			System.out.println(num_5 + (N-5*num_5)/3);
		}
	}
}
