import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class User {
    private final String userId;
    private final String pin;
    private double balance;
    private final List<String> transactionHistory;

    public User(String userId, String pin, double balance) {
        this.userId = userId;
        this.pin = pin;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
    }

    public boolean authenticate(String userId, String pin) {
        return this.userId.equals(userId) && this.pin.equals(pin);
    }

    public void deposit(double amount) {
        balance += amount;
        transactionHistory.add("Deposited $" + amount);
        printTransactionDetails("Deposited $" + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactionHistory.add("Withdrew $" + amount);
            printTransactionDetails("Withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void transfer(double amount, User recipient) {
        if (balance >= amount) {
            balance -= amount;
            recipient.deposit(amount);
            transactionHistory.add("Transferred $" + amount + " to " + recipient.userId);
            System.out.println("Transaction successful: Transferred $" + amount + " to " + recipient.userId);
            System.out.println("Your current balance: $" + balance);
            System.out.println("Recipient's current balance: $" + recipient.getBalance());
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public void viewTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet!");
        } else {
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
        System.out.println("Current balance: $" + balance);
    }

    public double getBalance() {
        return balance;
    }

    public String getUserId() {
        return userId;
    }

    private void printTransactionDetails(String message) {
        System.out.println("Transaction successful: " + message);
        System.out.println("Current balance: $" + balance);
    }
}

public class ATM {
    private final User user;
    private final List<User> users;

    ATM(User user, List<User> users) {
        this.user = user;
        this.users = users;
    }

    public void start() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter user ID: ");
            String userId = scanner.next();
            System.out.print("Enter PIN: ");
            String pin = scanner.next();

            if (user.authenticate(userId, pin)) {
                System.out.println("Login successful!");
                while (true) {
                    System.out.println("1. View transaction history");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Deposit");
                    System.out.println("4. Transfer");
                    System.out.println("5. Quit");
                    System.out.print("Choose an option: ");
                    int option = scanner.nextInt();

                    switch (option) {
                        case 1 -> user.viewTransactionHistory();
                        case 2 -> {
                            System.out.print("Enter amount to withdraw: ");
                            double withdrawAmount = scanner.nextDouble();
                            user.withdraw(withdrawAmount);
                        }
                        case 3 -> {
                            System.out.print("Enter amount to deposit: ");
                            double depositAmount = scanner.nextDouble();
                            user.deposit(depositAmount);
                        }
                        case 4 -> {
                            System.out.print("Enter recipient user ID: ");
                            String recipientUserId = scanner.next();
                            User recipient = getUserById(recipientUserId);
                            if (recipient != null) {
                                System.out.print("Enter amount to transfer: ");
                                double transferAmount = scanner.nextDouble();
                                user.transfer(transferAmount, recipient);
                            } else {
                                System.out.println("Recipient not found");
                            }
                        }
                        case 5 -> {
                            System.out.println("Goodbye!");
                            return;
                        }
                        default -> System.out.println("Invalid option");
                    }
                }
            } else {
                System.out.println("Invalid user ID or PIN");
            }
        }
    }

    private User getUserById(String userId) {
        for (User u : users) {
            if (u.getUserId().equals(userId)) {
                return u;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        User user1 = new User("1234", "1234", 1000.0);
        User user2 = new User("5678", "5678", 0.0);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        ATM atm = new ATM(user1, users);
        atm.start();
    }
}
