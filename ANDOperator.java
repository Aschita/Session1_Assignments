package ANDOperator;

import java.util.Scanner;

public class ANDOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		int c;
		System.out.println("Enter two digits: 0 or 1");
		a = sc.nextInt();
		b = sc.nextInt();
		
		c = a & b;
		System.out.println("Bitwise Output :"+c);
		
		if(c == 0)
		{
			System.out.println("Logical Output:False");
		}
		else
		{
			System.out.println("Logical Output: True");
		}
	}
}
