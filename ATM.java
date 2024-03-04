package Java_Task_02;

import java.util.Scanner;

class Account 
{
    private int accountNumber;
    private int pin;
    private double balance;

    public Account(int accountNumber, int pin, double balance) 
    {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public int getAccountNumber() 
    {
        return accountNumber;
    }

    public int getPin() 
    {
        return pin;
    }

    public double getBalance() 
    {
        return balance;
    }

    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawal Successful. Current Balance: $" + balance);
        } else {
            System.out.println("Invalid amount or insufficient balance.");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit Successful. Current Balance: $" + balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }
}

class ATM 
{
	
	    private Account account;

	    public ATM(Account account)
	    {
	        this.account = account;
	    }

	    public boolean validatePin(int enteredPin)
	    {
	        return enteredPin == account.getPin();
	    }

	    public void withdraw(double amount) 
	    {
	        account.withdraw(amount);
	    }

	    public void deposit(double amount)
	    {
	        account.deposit(amount);
	    }

	    public double checkBalance() 
	    {
	        return account.getBalance();
	    }
	

}

