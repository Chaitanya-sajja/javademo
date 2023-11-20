package methods;

import java.util.Scanner;

class FriendlypairApp {
	public static int app(int num) {
		int sum = 0;
		for(int i = 1; i<num; i++ ) {
			if(num%i==0) {
				sum = sum+i;
			}
		}
		return sum;
	}
}
public class Friendlypair {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter secound nunber: ");
		int num2 = sc.nextInt();
		int sum1 = FriendlypairApp.app(num1);
		int sum2 = FriendlypairApp.app(num2);
		int res1 = sum1/num1;
		int res2 = sum2/num2;
		if(res1==res2) {
			System.out.println("Enter number "+num1+" and "+num2+" are friendlypairs");
		}
		else {
			System.out.println("Enter number "+num1+" and "+num2+" are not friendlypairs");
		}
		sc.close();

	}

}
