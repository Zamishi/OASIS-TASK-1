package com.example.atm;

import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
    public static String name;
    public static int balance = 0;
    public static String accNumber;
    public static ArrayList<String> history = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in); 
    
    public static void main(String[] args) {
        homepage();
        sc.close();
    }
    
    public static void updateBalance(int amount) {
        balance += amount;
    }
    
    public static void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void homepage() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("WELCOME TO ATM INTERFACE");
			System.out.println("--------------------------");
			System.out.println("Select option:");
			System.out.println("1. Register");
			System.out.println("2. Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			    case 1:
			        BankAccount.register();
			        break;
			    case 2:
			        System.exit(0);
			        break;
			    default:
			        System.out.println("Invalid option! Please select 1 or 2.");
			        homepage();
			        break;
			}
		}
    }

    public static void prompt() {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("WELCOME " + name + "! TO ATM SYSTEM");
			System.out.println("---------------------");
			System.out.println("Select option:");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. Transfer");
			System.out.println("4. Check balance");
			System.out.println("5. Transaction History");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			    case 1:
			        Transaction.withdraw();
			        break;
			    case 2:
			        Transaction.deposit();
			        break;
			    case 3:
			        Transaction.transfer();
			        break;
			    case 4:
			        Check.checkBalance();
			        break;
			    case 5:
			        History.transactionHistory();
			        break;
			    case 6:
			        System.exit(0);
			        break;
			    default:
			        System.out.println("Invalid choice! Please select a valid option.");
			        prompt();
			        break;

			}
		}
    }
}
