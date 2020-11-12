package implementationOfDataStructures;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashSetSubArray {
		public static void find(int[]A) {
			
			
			Set<Integer> set = new HashSet<>();
			set.add(0); int sum = 0;
			for(int value : A) {
				sum = sum+value;
				if(set.contains(sum)) {
					System.out.println("Subarray exists " + sum + value );
					return;
				}set.add(sum);
			}
			System.out.println("Not found ");
			
			
		}
		public static void main(String[] args) {
			int [] A= {3,4,-7,3,1,-4,-2,-2};
			find(A);
		}
}
