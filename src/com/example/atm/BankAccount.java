package com.example.atm;

import java.util.Scanner;

class BankAccount {
    static void register() {
        System.out.println("---------------------------");
        System.out.println("Enter your name :");
        ATM.name = ATM.sc.nextLine();
        System.out.println("Enter username :");
        String user = ATM.sc.nextLine();
        System.out.println("Enter password :");
        String pass = ATM.sc.nextLine();
        System.out.println("Enter your Account number :");
        ATM.accNumber = ATM.sc.nextLine();
        System.out.println("REGISTRATION SUCCESSFULLY!");
        System.out.println("---------------------------");
        ATM.prompt();
        while (true) {
        	System.out.println("1. Login");
		    System.out.println("2. Exit");
		    System.out.print("Enter your choice: ");
            int choice = ATM.sc.nextInt();
            if (choice == 1) {
            	 login(user, pass);
			        break;
            } else if (choice == 2) {
                System.exit(0);
            } else {
                System.out.println("Bad value! Enter again!");
            }
        }
    }

    private static void login(String user, String pass) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter username: ");
			String username = sc.nextLine();
			System.out.println("Enter password: ");
			String password = sc.nextLine();
			if (username.equals(user) && password.equals(pass)) {
			    System.out.println("Login successful!");
			    ATM.prompt();
			} else {
			    System.out.println("Invalid credentials! Try again.");
			    login(user, pass);
			}
		}
    }
}

