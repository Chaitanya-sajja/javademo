package methods;

import java.util.Scanner;
class Abudent {
	public static boolean find(int num) {
		int sum = 0;
		for(int i= 1;i<num;i++) {
			if(num%i==0) {
				sum = sum+i;
			}
		}
		if(sum>num) {
			return true;
		}
		else 
		{
			return false;
		}
	}
}
public class AbudentNumberOrNot {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number: ");
		 int num = sc.nextInt();
		 boolean res = Abudent.find(num);
		 if(res == true) {
			 System.out.println("Enter number "+num+" is a abudent number");
		 }
		 else {
			 System.out.println("Enter number "+num+" is not a abudent number");
		 }
		 sc.close();

	}

}
