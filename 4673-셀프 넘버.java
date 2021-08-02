package Main;

import java.util.*;
import java.io.*;


public class Main {
	static double[][] comb_set = new double[41][41];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[12000];
		
		for(int i = 0; i < 10; i ++) {
			for(int j = 0; j < 10; j++) {
				for(int k = 0; k < 10; k++) {
					for(int l = 0; l < 10; l++) {
						arr[1001*i+101*j+11*k+2*l] = 1;
					}
				}
			}
		}
		
		
		for(int i = 1; i <= 10000; i++) {
			if(arr[i] != 1) {
				System.out.println(i);
			}
		}
		
	}
}