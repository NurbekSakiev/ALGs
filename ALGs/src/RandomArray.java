import java.util.*;
import java.lang.*;

public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m=5,n=10000;
		
		int[] arr = new int[n];
		
		Random rand = new Random();
		
		for (int i=0; i<n; i++) {
			arr[i] = rand.nextInt(100-1)+1;
		}
		
		for (int j=0; j<m; j++) {
			int x = rand.nextInt(n-1);
			System.out.println(arr[x]);
		}
	}
	
	

}
