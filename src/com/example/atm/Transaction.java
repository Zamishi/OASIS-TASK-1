package com.example.atm;

class Transaction {
    static void withdraw() {
        System.out.println("----------------");
        System.out.println("Enter amount to withdraw :");
        int wcash = ATM.sc.nextInt();
        if (wcash <= ATM.balance) {
            ATM.balance -= wcash;
            ATM.history.add(Integer.toString(wcash));
            ATM.history.add("Withdraw");
            System.out.println("Amount Rs" + wcash + "/- withdraw successfully");
            System.out.println("---------------------------");
        } else {
            System.out.println("Insufficient balance to withdraw the cash");
            System.out.println("---------------------------");
        }
        ATM.prompt();
    }

    static void deposit() {
        System.out.println("----------------");
        System.out.print("Enter amount to deposit :");
        int dcash = ATM.sc.nextInt();
        ATM.updateBalance(dcash);
        ATM.history.add(Integer.toString(dcash));
        ATM.history.add("Deposit");
        System.out.println("Amount Rs." + dcash + "/- deposit successful!");
        System.out.println("---------------------------");
        ATM.prompt();
    }

    public static void transfer() {
			System.out.print("Enter the receiving account: ");
			String receiver = ATM.sc.next();
			System.out.print("Enter the amount to transfer: ");
			int amount = ATM.sc.nextInt();
			if (amount <= ATM.balance) {
			    ATM.balance -= amount;
			    ATM.history.add("Transferred: " + amount + " to " + receiver);
			    System.out.println("Amount Rs " + amount + "/- transferred successfully to " + receiver);
			    System.out.println("---------------------------");
			} else {
			    System.out.println("Insufficient balance to transfer the cash");
			    System.out.println("---------------------------");
        ATM.prompt();
			}
    }
}


   

   

