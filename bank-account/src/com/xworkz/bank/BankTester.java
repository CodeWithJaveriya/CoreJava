package com.xworkz.bank;

import com.xworkz.bank.bankaccount.BankAccount;
import com.xworkz.bank.jointaccount.JointAccount;
import com.xworkz.bank.savingsbank.SavingsBankAccount;

import java.time.LocalDate;

public class BankTester {


    public static void main(String[] test){

        //polymorphism
        BankAccount myAccount = new SavingsBankAccount();
        myAccount.setBalance(20000);
        myAccount.credit(2000);
        System.out.println("The amount credited is : " +  myAccount.getBalance() + LocalDate.now());

        myAccount.debit(200);
        System.out.println("The amount debited is : " +  myAccount.getBalance() + LocalDate.now());

        BankAccount freindsAccount = new BankAccount();
        myAccount.transfer(800 , freindsAccount);
        System.out.println("The balance in my account is : " + myAccount.getBalance());
        System.out.println("The balance in freinds account is : " + freindsAccount.getBalance());

    }
}
