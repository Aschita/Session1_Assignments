package TypeCasting;

import java.util.Scanner;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a byte value");
		byte a = sc.nextByte();
		
		System.out.println("Enter a short value");
		short b = sc.nextShort();
		
		int sum;
		sum = a + b; 
		
		System.out.println("Value of Sum of byte and short is :" +sum);
		
		long d;
		d = sum + b;
		
		System.out.println("Value of sum of short and int is: " +d);
		
		float f;
		f = d + sum;
		
		System.out.println("Value of sum of int and long is: " +f);
		
		double e;
		e = d + f;
		
		System.out.println("Value of sum of long and float is: " +e);
		
	}

}
