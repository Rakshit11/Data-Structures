package implementationOfDataStructures;

import java.util.Arrays;

public class PartitionUsingStack {
	public static void partition(int [] A, int end ) {
		
		int start = 0 ; int mid = 0 ; int pivot = 1;
		while(mid<=end) {
			if(A[mid]<pivot) {
				swap(A, start, mid);
				start++;
				mid++;
			}else if (A[mid]>pivot) {
				swap(A,mid,end);
				end--;
			}
			else mid++;
		}
		
	}
	private static void swap(int[]A, int i , int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j]= temp;
	}
	public static void main(String [] args) {
		int [] A= {2,2,2,2,2,1,1,1,0,0,1,0,0,2,0,1,0,0,1,0,1,1};
		partition(A,A.length-1);
		System.out.println(Arrays.toString(A));
	}
}
