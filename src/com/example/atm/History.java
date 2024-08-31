package com.example.atm;

public class History {

    public static void transactionHistory() {
        System.out.println("---------------------");
        System.out.println("Transaction History:");
        if (ATM.history.size() > 0) {
            for (String transaction : ATM.history) {
                System.out.println(transaction);
            }
        } else {
            System.out.println("Your account is empty");
        }
        System.out.println("---------------------");
        ATM.prompt();
    }
}
