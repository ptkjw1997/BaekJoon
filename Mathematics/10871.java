package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] str = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]), X = Integer.parseInt(str[1]);
		
		String[] array = br.readLine().split(" ");
		for(int i = 0; i < N ; i++) {
			if (Integer.parseInt(array[i]) < X) {
				System.out.print(Integer.parseInt(array[i]));
				if (i!= N-1) {
					System.out.print(" ");
				}
			}
		}
	}
}
