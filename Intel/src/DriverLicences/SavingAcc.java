package DriverLicences;

import java.util.Scanner;
import java.io.*;

public class SavingAcc{


        private double balance;
        private double annualRate;

        public SavingAcc(double balance){
            this.balance = balance;
        }
        public double getBalance(){
            return this.balance;
        }

        public String withdrawl(double with){
            if(balance >= with){
                balance = balance - with;
            }
            else{
                System.out.println("your balance is low");
                System.exit(0);
            }
            return "you debit " + with +
                    "\nyour remaining balance is " + this.balance;
        }
        public String deposite(double dep){
            while(dep <= 0){
                System.out.print("enter valid amount : ");
                dep = new Scanner(System.in).nextDouble();
            }
            this.balance = this.balance + dep;
            return "you save : " + dep +
                    "\nyour current balance is : " + this.balance;
        }
        public String mn(String str){
            try{
                File f = new File(str);
                Scanner s = new Scanner(f);
                while(s.hasNext()){
                    int i = s.nextInt();
                    deposite(i);
                }
                s.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            return "";
    }
}