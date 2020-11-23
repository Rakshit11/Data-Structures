package arrayQuestions;

import java.util.Arrays;

public class Questions {
	public static void merge(int[]X,int[]Y,int m,int n) {
		int k = m+n+1;
		while(m>=0&&n>0) {
			if(X[m]>Y[n]) {
				X[k--]= X[m--];
			} else {
				X[k--] = Y[n--];
			}
		}
		while(n>=0) {
			X[k--] = Y[n--];
		}
		Arrays.fill(Y,0);
	}
	public static void rearrange(int[]X,int[]Y) {
		int k = 0;
		for(int value: X) {
			if(value!=0) {
			X[k++]=value;
			}
		}
		merge(X, Y, k-1, Y.length-1);
	}
	public static void main(String[] args) {
		int [] X = {2,4,5,7,8,0,11,0,13};
		int [] Y = {9,12};
		rearrange(X, Y);
		System.out.println(Arrays.toString(X));
	}
}