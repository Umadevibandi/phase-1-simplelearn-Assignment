package projeCT;
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class ArthematicCalculator {

	public static void main(String[] args) {
			double x, y;
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter the numbers");
			x = sc.nextDouble();

			y= sc.nextDouble();

			System.out.println("Enter the operator (+,-,*,/)");

			char ch = sc.next().charAt(0);

			double o = 0;

			switch (ch) {
			case '+':

				o = x + y;

				break;
			case '-':

				o = x - y;

				break;
			case '*':

				o = x * y;

				break;
			case '/':

				o = x / y;

				break;

			default:

				System.out.println("You enter wrong input");
				
				break;
			}
			System.out.println("The final result:");
			System.out.println();
			System.out.println(num1 + " " + op + " " + num2
							+ " = " + o);
	

	}
}
