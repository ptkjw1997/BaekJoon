package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] str = br.readLine().split(" ");
		
		int[] array = new int[N];
		
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(str[i]);
		}
		
		Sort(array, 0, N-1);
		System.out.println(Cumsum(array));
	}
	static void Sort(int[] array, int p, int r) {
		if(p<r) {
			int q = partition(array, p, r);
			Sort(array, p, q-1);
			Sort(array, q+1, r);
		}
	}
	
	static int partition(int[] array, int p, int r) {
		int pivot = array[r];
		int i = p-1;
		for (int j = p; j < r ; j++) {
			if(array[j] < pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		array[r] = array[i+1];
		array[i+1] = pivot;
		return i+1;
	}
	
	static int Cumsum(int[] array) {
		int result = 0;
		for (int i = 0; i < array.length; i++) {
			result += array[i] * (array.length - i);
		}
		return result;
	}
}
