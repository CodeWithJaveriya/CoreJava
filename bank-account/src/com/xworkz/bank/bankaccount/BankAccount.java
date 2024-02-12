package com.xworkz.bank.bankaccount;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BankAccount {








    private double balance;

   /* public double getBalance() {

        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    } */



    public void credit(double amount) {
        if (amount > 0)
            this.balance = balance + amount;
        else
            System.out.println("Cannot transfer amount when your balance is 0");

    }

    public void debit(double amount){
        if(amount <= balance)
            this.balance = balance - amount;
        else
            System.out.println("Cannot debit when your bank balance is less");
    }

    public void transfer(double amount, BankAccount otherAccount){
       otherAccount.credit(amount);
       this.debit(amount);

    }


}

