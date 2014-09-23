import java.awt.*;
import java.util.*;
import java.lang.*;

public class DieCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		int num = rand.nextInt(6)+1;
		
		if (num%2 == 0) {
			System.out.println("It's a head");
		}
		
		else {
			System.out.println("It's a tail");
		}

	}

}
