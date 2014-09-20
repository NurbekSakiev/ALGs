import java.math.*;
import java.util.*;
import java.lang.*;
public class Algs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(RaiseToPower(7,6));
	}
	public static double RaiseToPower(int base, int power) {
		int num =1;
		int second=0;
		double res = 1;
		while (num+1<power) {
			num*=2;
		}
		num/=2;
		while (power>second) {
			second+=num;
			res *=Math.pow(base,num);
			num/=2;
		}
		return res;
	}

}
