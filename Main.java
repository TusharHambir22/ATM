package Java_Task_02;

import java.util.Scanner;

public class Main 
{


	public static void main(String[] args) 
	{
		Account account = new Account(123456, 1234, 1000.0);
		ATM atm = new ATM(account);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the ATM!");

		System.out.print("Enter your account number: ");
		int enteredAccountNumber = scanner.nextInt();

		System.out.print("Enter your PIN: ");
		int enteredPin = scanner.nextInt();

		if (enteredAccountNumber == account.getAccountNumber() && atm.validatePin(enteredPin)) 
		{
			System.out.println("Login successful!");

			int choice;
			do {
				System.out.println("\nMenu:");
				System.out.println("1. Withdraw");
				System.out.println("2. Deposit");
				System.out.println("3. Check Balance");
				System.out.println("4. Exit");
				System.out.print("Enter your choice: ");
				choice = scanner.nextInt();

				switch (choice) 
				{
				case 1:
					System.out.print("Enter amount to withdraw: ");
					double withdrawAmount = scanner.nextDouble();
					atm.withdraw(withdrawAmount);
					break;
				case 2:
					System.out.print("Enter amount to deposit: ");
					double depositAmount = scanner.nextDouble();
					atm.deposit(depositAmount);
					break;
				case 3:
					System.out.println("Your balance is: $" + atm.checkBalance());
					break;
				case 4:
					System.out.println("Thank you for using our ATM. Goodbye!");
					break;
				default:
					System.out.println("Invalid choice. Please try again.");
				}
			} 
			while (choice != 4);
		} 
		else
		{
			System.out.println("Invalid account number or PIN. Please try again.");
		}

		scanner.close();
	}


}
