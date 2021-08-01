package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String password = br.readLine();
		char[] ps_array = password.toCharArray();
		int[] result = new int[password.length()];
		
		if(password.charAt(0) == '0') {
			System.out.println(0);
			return;
		}
		
		for(int i = 0; i < password.length(); i++) {
			if (i == 0 ) {
				if (ps_array[0] - '0' != 0) {
					result[i] = 1;
				} else {
					result[i] = 0;
				}
			} else if (i == 1) {
				if( (ps_array[0] - '0') * 10 + (ps_array[1] - '0') <= 26 & (ps_array[0] - '0') * 10 + (ps_array[1] - '0') >= 10) {
					if (ps_array[1] - '0' > 0) {
						result[i] = 2;
					} else {
						result[i] = 1;
					}
				} else {
					if (ps_array[i] - '0' > 0) {
						result[i] = 1;
					} else {
						result[i] = 0;
					}
				}
			} else {
				
				if(( (ps_array[i-1] - '0') * 10 + (ps_array[i] - '0') <= 26 & (ps_array[i-1] - '0') * 10 + (ps_array[i] - '0') >= 10) & (
						(ps_array[i] - '0' > 0)) ) {
					result[i] = (result[i-1] + result[i-2]) % 1000000;
				} else if (ps_array[i] - '0' > 0) {
					result[i] = result[i-1];
				} else if (( (ps_array[i-1] - '0') * 10 + (ps_array[i] - '0') <= 26 & (ps_array[i-1] - '0') * 10 + (ps_array[i] - '0') >= 10)){
					result[i] = result[i-2];
				} else {
					result[i] = 0;
				}
			}
		}
		
		System.out.println(result[password.length()-1]);
	}
	
}