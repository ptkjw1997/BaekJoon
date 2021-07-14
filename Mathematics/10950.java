package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int total_case = Integer.parseInt(br.readLine());
		
		while(total_case-- > 0) {
			String[] str = br.readLine().split(" ");
			
			int a = Integer.parseInt(str[0]), b = Integer.parseInt(str[1]);
			System.out.println(a+b);
		}
	}
}
