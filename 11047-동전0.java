package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String[] str = br.readLine().split(" ");
		int N = Integer.parseInt(str[0]), K = Integer.parseInt(str[1]);
		int[] value = new int[N];
		
		int low_max = -1;
		for (int i = 0; i < N ; i++) {
			value[i] = Integer.parseInt(br.readLine());
			if(value[i] < K) {
				low_max = i;
			}
		}
		
		int total_count = 0;
		while(low_max-- >= 0) {
			total_count += K/value[low_max+1];
			K -= value[low_max+1] * ( K/value[low_max+1] );
		}
		System.out.println(total_count);
	}
}
