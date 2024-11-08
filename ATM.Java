package Automatic;
import java.util.Scanner;
public class ATM {
	public static void main(String[] args) {
		int Balance = 100000;
		int Withdraw,Deposit;
		Scanner s = new Scanner(System.in);
		for(int i=0;i<=10;i++) {
			System.out.println("ATM");
			System.out.println("Choose W to withdraw");
			System.out.println("Choose D to Deposit");
			System.out.println("Choose B to Balance Enquiry");
			System.out.println("Choose E to Exit");
			System.out.println("Choose the Operation Do You Want");
			int obj = s.next().charAt(0);
			switch(obj) {
			case 'w':
			System.out.println("Enter The Amount");
			Withdraw = s.nextInt();
			if(Balance>=Withdraw) {
				System.out.println("Please Collect The Class");
				System.out.println("Thank You For Using This ATM");
			}
			else {
				System.out.println("Insufficient Fund");
			}
			System.out.println("");
			break;
			case 'D':
				System.out.println("Please Enter The Cash");
			Deposit = s.nextInt();
			Balance = Balance+Deposit;
			System.out.println("Being Deposit");
			System.out.println("Your Money Has Been Successfully Deposit");
			System.out.println("Your Avaiable Balance"+ Balance);
			System.out.println("");
			break;
			case 'B':
				System.out.println("Check Balance" + Balance);
				System.out.println("");
				break;
			case 'E':
				System.out.println("Thank You For Visiting Our ATM");
				System.out.println("");
				break;
				default :
					System.out.println("Please Enter the Number");
					System.out.println("");
			}
		}

	}

}
