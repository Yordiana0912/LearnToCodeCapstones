package com.pluralsight;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountingLedgerApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        static ArrayList<Transaction> transactions = new ArrayList<>();
        //Date | Time | Description | Vendor | Amount
        transactions.add(new Transaction("2024-05-01", "Rent", 2600.00, "Deposit"));
        transactions.add(new Transaction("2024-05-12", "Apple Music ", -20.00, "Withdrawal"));
        transactions.add(new Transaction("2024-05-29", "Chic fil A", -50.00, "Withdrawal"));

        System.out.println("Welcome to your financing application ");
        System.out.println("Please select what you would like to do ?");
        System.out.println("1.Deposit , 2. Make a payment , 3.View Ledger ");
        // providing client options on what they would like to do
        int userresponces = Integer.parseInt(scanner.nextLine());
        // we would recieved user input

        switch (userresponces) {
            case 1:
                System.out.println(" Please enter your deposit information");
                String date = scanner.nextLine();

                System.out.println("Name of deposit");
                String name = scanner.nextLine();

                System.out.println("How much is the deposit:  ");
                Double amount = Double.valueOf(scanner.nextLine());

                System.out.println("Please enter debit information");
                String debitInfo = scanner.nextLine();
                break;

            case 2:
                System.out.println(" Please enter your payment information");
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

                String dateledger = scanner.nextLine();

                System.out.println("Name of payment on ledger  ");
                String nameledger = scanner.nextLine();

                System.out.println("How much is the payment on ledger  :  ");
                Double amountledger = Double.valueOf(scanner.nextLine());

                System.out.println("Please enter debit ledger");
                String debitInfoledger = scanner.nextLine();
                // need to have information to save to csv file
                try {
                    BufferedWriter bufWriter = new BufferedWriter(new FileWriter("transactions.csv"));
                    bufWriter.write("Date, Name, Amount , DebitInfo \n");
                    // writer our trasnaction
                    for (Transaction transaction : transactions) {

                        bufWriter.write(String.format("%s,%s,%.2f,%s\n", transaction.getDate(), transaction.getName(), transaction.getAmount(), transaction.getDebitInfo()));
                        bufWriter.close();
                        System.out.println("transaction successfully.");

                        //provide the current that we are on
                        LocalDate today = LocalDate.now();
                        System.out.println("Today is " + today);

                        LocalTime currentTime = LocalTime.now();
                        System.out.println("The current time is :" + currentTime);

                        transactions.add(new Transaction(Local, "Rent", 2600.00, "Deposit"));

                        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");//2024-04-25 10:25:08
                        //String timestamp = LocalDateTime.now().format(formatter);

                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;

        }


    }  // below is to read from file

    public static void readTransactionFile() {
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("transactions.csv"));
            //read each line of the file // and is going to add it to an array list
            String line;
            while ((line = bufReader.readLine()) != null) {
                // create array type string // this is called escape character \\
                String[] splitLine = line.split("\\|");
                //this will read the date from the file and put it into the array list
                // array is called splitline
                LocalDate date = LocalDate.parse(splitLine[0]);
                LocalTime time = LocalTime.parse(splitLine[1]);
                String name = splitLine[2];
                Double amount = Double.parseDouble(splitLine[3]);
                String debitInfo = splitLine[4];
                System.out.println("date:" + date + "time" + time + "name" + name + "amount" + amount + "debitInfo" + debitInfo);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // completing the ledger
    public class Ledgerapp {
        private static final String CSV_FILE = "transaction.csv";
        private boolean userBackToMenu;

        public void viewLedger(Scanner scanner) {
            boolean backToMenu = false;

            while (!backToMenu) {
                System.out.println("Transaction Ledger : ");
                System.out.println("New Entries :");
                System.out.println("All Entries :");
                System.out.println("All Deposit: ");
                System.out.println("All Payments : ");
                System.out.println("Reports : ");
                System.out.println("Back to home :");

                int userresponce = scanner.nextInt();
                scanner.nextLine();

                switch (userresponce) {
                    case 1:
                        userNewEntries();
                        break;

                    case 2:
                        userEntries();
                        break;

                    case 3:
                        userDeposit();
                        break;

                    case 4:
                        userPayments();
                        break;

                    case 5:
                        userReports(scanner);
                        break;

                    case 6:
                        userBackToMenu = true;
                        break;


                }
            }

        }

        private void userEntries() {
        }

        private void userNewEntries() {
        }

        private void userDeposit() {
            // Implement logic to display deposit entries
        }
    }

    private void userPayments() {
        // Implement logic to display deposit entries
    }

    private void userReports(Scanner scanner) {
    }

    private void backToMenu() {
        boolean backToMenu = false;

    }

    private void report(Scanner scaner) {
        boolean backToMenu = false;
        while (!backToMenu){
            System.out.println("Reports: ");
            System.out.println("1. Month to date :");
            System.out.println("2. Previous Months : ");
            System.out.println("3. Year to date :");
            System.out.println("4. Previous Year");
            System.out.println("5. Search by Vendor");
            System.out.println("6. Back to Ledger");
            System.out.println(" Enter you choice: ");
            int userresponce = scaner.nextInt();
            
        }
    }

}


