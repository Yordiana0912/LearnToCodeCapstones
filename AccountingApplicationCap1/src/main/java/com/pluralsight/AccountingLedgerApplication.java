package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AccountingLedgerApplication {
    public static <Transaction> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //scanner added to start taking user input
        System.out.println("Welcome to your financing application ");
        // have the user enter debit information

        System.out.println(" Please enter your deposit information");
        System.out.println("Date(YYYY-MM-DD: ");
        String date = scanner.nextLine();

        System.out.println("Name of deposit");
        String name = scanner.nextLine();

        System.out.println("How much is the deposit:  ");
        Double amount = Double.valueOf(scanner.nextLine());

        System.out.println("Please enter debit information");
        String debitInfo = scanner.nextLine();

        // need to write to file

        try {
            FileWriter writer = new FileWriter("transactions.csv");
            writer.write("Date, Name, Amount , DebitInfo \n"); 

            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");//2024-04-25 10:25:08
            String timestamp = LocalDateTime.now().format(formatter);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}