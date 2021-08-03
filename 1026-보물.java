package Main;

import java.util.*;
import java.io.*;


public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] A = new int[N];
		int[] B = new int[N];
		
		String[] line = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(line[i]);
		}
		
		line = br.readLine().split(" ");
		for(int i = 0; i < N; i++) {
			B[i] = Integer.parseInt(line[i]);
		}
		
		Sort(A, 0, N-1);
		Sort(B, 0, N-1);
		int res = 0;
		for(int i = 0; i < N; i++) {
			res += A[i] * B[N-1-i];
		}
		System.out.println(res);
	}
	
	private static int partition(int[] arr, int left, int right) {
		int pivot = arr[right];
		int i = left-1;
		for(int j = left; j < right; j++) {
			if(arr[j] < pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		int dum = arr[i+1];
		arr[i+1] = pivot;
		arr[right] = dum;
		return i+1;
	}
	
	private static void Sort(int[] arr, int left, int right) {
		if(left < right) {
			int pivot = partition(arr, left, right);
			Sort(arr, left, pivot-1);
			Sort(arr, pivot+1, right);
		}
	}
	
}