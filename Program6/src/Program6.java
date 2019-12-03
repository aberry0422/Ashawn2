//Project Name: Program 6
//Author: Ashawn Berry
//version: 1.0
//Last modified: 11/3/19
	import java.util.Scanner;
public class account {
static double  balance;

public account(int bal) {
	balance=bal;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		int dep;
		int wit;
		Scanner keyboard = new Scanner(System.in);
		account.menu();
		

		while(choice!=4) {
			choice = keyboard.nextInt();
			if (choice==1) {
				System.out.println("How much are you going to deposit?");
				dep=keyboard.nextInt();
				account.deposit(dep);
				System.out.println("\nWhat do you want to do now?");
			}
			if(choice==2) {
				System.out.println("How much are you going to withdraw?");
				wit=keyboard.nextInt();
				account.withdraw(wit);
				System.out.println("\nWhat do you want to do now?");
			}
			if (choice==3){
				account.checkBalance();
				System.out.println("\nWhat do you want to do now?");
			}
			if (choice!=1&&choice!=2&&choice!=3&&choice!=4) {
				System.out.println("THIS IS NOT A VALID OPTION!");
			}
			

			

			

		}
		System.out.println("Bye! Have a beautiful time!\nYou have $"+(account.getBalance()));

	}
public static void deposit(int dep) {
	balance+=dep;
}
public static void withdraw(int wit) {
	balance-=wit;
	if (balance<0) {
		balance=0;
		System.out.println("\n\nYou are in debt sir!\n\n");
	}
}
	public static void checkBalance() {
		System.out.println("Balance: $"+ balance);
	}
	public static void menu() {
		System.out.println("Welcome to the Bank of Wakanda");
		System.out.println("Press the corresponding numbers for the corresponding action");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check Balance");
		System.out.println("4. Leave");
	}
	public static double getBalance() {
	return balance;
	}
}
