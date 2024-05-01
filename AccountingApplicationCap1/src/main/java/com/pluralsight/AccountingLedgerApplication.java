package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountingLedgerApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your financing application ");
        System.out.println("Please select what you would like to do ?");
        System.out.println("1.Deposit , 2. Make a payment , 3.View Ledger");
// providing client options on what they would like to do
        int userresponces = Integer.parseInt(scanner.nextLine());
        // we would recieved user input

        switch (userresponces) {
            case 1:
                System.out.println(" Please enter your deposit information");
                System.out.println("Date(YYYY-MM-DD: ");
                String date = scanner.nextLine();

                System.out.println("Name of deposit");
                String name = scanner.nextLine();

                System.out.println("How much is the deposit:  ");
                Double amount = Double.valueOf(scanner.nextLine());

                System.out.println("Please enter debit information");
                String debitInfo = scanner.nextLine();
                break;

            case 2:
                System.out.println(" Please enter your paymentinformation");
                System.out.println("Date(YYYY-MM-DD: ");
                String datepayment = scanner.nextLine();

                System.out.println("Name of payment ");
                String namepayment = scanner.nextLine();

                System.out.println("How much is the payment :  ");
                Double amountpayment = Double.valueOf(scanner.nextLine());

                System.out.println("Please enter debit payment ");
                String debitInfopayment = scanner.nextLine();

                break;

            case 3:
                System.out.println(" Please enter your Ledger information ");
                System.out.println("Date(YYYY-MM-DD: ");
                String dateledger = scanner.nextLine();

                System.out.println("Name of payment on ledger  ");
                String nameledger = scanner.nextLine();

                System.out.println("How much is the payment on ledger  :  ");
                Double amountledger = Double.valueOf(scanner.nextLine());

                System.out.println("Please enter debit ledger");
                String debitInfoledger = scanner.nextLine();

            try {
                FileWriter writer = new FileWriter ("src/ main/ resources/ transactions.csv");
                        writer.write("Date, Name, Amount , DebitInfo \n");

                // writer our trasnaction
                for (transaction transaction : transaction) {
                    writer.write(String.format("%s,%s,%.2f,%s\n"));
                    transaction.getDate(),
                            transaction.getName(),
                            transaction.getAmount(),
                            transaction.geDebitInfo();

                    writer.close();
                    System.out.println("transaction successfully.");

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");//2024-04-25 10:25:08
                    String timestamp = LocalDateTime.now().format(formatter);

                }
            } catch (IOException e) {
                throw new RuntimeException(e);}
                break;



                //    List<Transaction> transactions = new ArrayList<>();

        // Add sample transactions
       // transactions.add(new Transaction("2024-05-01", "Rent", 2600.00, "Deposit"));
       // transactions.add(new Transaction("2024-05-12", "Apple Music ", -20.00, "Withdrawal"));
       // transactions.add(new Transaction("2024-05-29", "Chic fil A", -50.00, "Withdrawal"));

    }


}}}