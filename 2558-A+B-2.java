package Main;

import java.util.*;
import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int res = 0;
		for(int i = 0; i < 2; i++) {
			res += Integer.parseInt(br.readLine());
		}
		System.out.println(res);
	}
}