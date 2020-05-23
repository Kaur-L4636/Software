/**
 * 
 */
package myJavaProject;

import java.util.Scanner;

/**
 * @author lakhv
 *
 */
public class myAppTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input =new Scanner(System.in);
		int x=0;
		System.out.println("Enter any number then i will tell you that number is odd or even");
		x= input.nextInt();
		oddEven(x);
	}
	
	private static void oddEven(int a) {
		// TODO Auto-generated method stub
		if(a%2 ==0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
	}
}
