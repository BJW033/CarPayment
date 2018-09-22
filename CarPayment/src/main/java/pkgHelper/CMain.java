package pkgHelper;

import java.util.Scanner;

public class CMain {
	public static void main (String args[]) {
	Scanner input = new Scanner(System.in);
	System.out.println("Total Cost: ");
	double cost = input.nextDouble();
	System.out.println("Down Payment: ");
	double down = input.nextDouble();
	System.out.println("Length of Loan: ");
	int loanlength = input.nextInt();
	System.out.println("Intrest Rate: ");
	double rate = input.nextDouble();
	CarPayment pay = new CarPayment(cost, down,loanlength,rate);
	System.out.print(pay);
}
}
