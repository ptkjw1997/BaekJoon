package baekjoon;/*
 * import java.io.*
 * import java.utils.*
 * 
 * Scanner sc = new Scanner(System.in)
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
 * 
 * sc.nextLine()
 * br.readLine()
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		LinkedList<Integer> queue = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] array = new int[N];
		
		String[] line = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(line[i]);
		}
		
		int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
		for(int i = 0; i < N ; i++) {
			max_ending_here += array[i];
			if(max_ending_here > max_so_far) max_so_far = max_ending_here;
			if(max_ending_here < 0) max_ending_here = 0;
		}
		
		System.out.println(max_so_far);
	}
}
