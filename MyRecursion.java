package implementationOfDataStructures;


public class MyRecursion {
//	calculating power power method O(n) time , fastpower O(logn) time
	 static int stepcount = 0;
	
	public static void main(String [] args) {
		stepcount=0;
		System.out.println(fastPower(3,150));
		System.out.println(stepcount);
	}
	
	static int power(int a,int b) {
		stepcount++;
		if(b==0) {
			return 1;
		}
		
		return a*power(a,b-1);
		
	}
	static int fastPower(int a , int b) {
		stepcount++;
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			return fastPower(a*a, b/2);
		}
			return a*fastPower(a, b-1);
		
		
	}
	
	
}

