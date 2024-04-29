package com.pluralsight;

public class LedgerApp {

    private String date;
    private String name;
    private Double amount;
    private String debitInfo;

    public void Transaction(String date, String name , double amount , String debitInfo) {
        this.date = date;
        this.name =  name ;
        this.amount =  amount ;
        this.debitInfo = debitInfo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDebitInfo() {
        return debitInfo;
    }

    public void setDebitInfo(String debitInfo) {
        this.debitInfo = debitInfo;
    }
}
