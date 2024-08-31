package com.example.atm;

public class Check {

    public static void checkBalance() {
        System.out.println("------------------");
        System.out.println("The available balance in the bank account:");
        ATM.showBalance();
        System.out.println("---------------------------");
        ATM.prompt();
    }
}

