package com.rohit.java_Object_Oriented.object_class;

class Account{
    String name;
    int amount;
    int accountNo;

    public Account(String name , int amount , int accountNo){
        this.name = name;
        this.amount = amount;
        this.accountNo = accountNo;
    }

    public void deposit(int amt){
        amount += amt;
    }

    public void withdraw(int amt){
        if(amount <= 0 || amount - amt < 0){
            System.out.println("You don't have sufficient money in your Account");
            return;
        }
        amount -= amt;
    }

    public void displayUserInfo(){
        System.out.println("Name : "+name);
        System.out.println("Account No : " + accountNo);
        System.out.println("Amount : " + amount);

    }

}

public class TestAccount {
    public static void main(String[] args) {
        Account a = new Account("Rohit khatri", 100 , 2091090);
        a.displayUserInfo();
        a.deposit(200);
        a.displayUserInfo();
        a.withdraw(500);
    }
}
