package BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class SavingAccount extends BankAccount{

    private boolean status;  // To represent if the account is active or inactive
    private ArrayList<String> his = new ArrayList<>(); //To hold transaction history
    private ArrayList<String> date = new ArrayList<>(); // To hold the date of transaction

    public SavingAccount(double balance, double anInterest){
        super(balance,anInterest);
    }

    public void deposit(double amount){

            if((getBalance() + amount) >= 25){
                super.deposit(amount);
                this.status = true;
                his.add("Deposite : " + amount + " Birr");
                System.out.print("Enter the date : ");
                String date = new Scanner(System.in).nextLine();
                this.date.add(date);
            }
            if(!isStatus()){
            System.out.println("SORRY YOUR ACCOUNT IS INACTIVE" +
                    "\n-----------------------------" +
                    "\ndeposit more money to turn to active.");
            System.exit(0);
        }
    }

    public void withdraw(double amount){
        if(!isStatus()){
            System.out.println("SORRY YOUR ACCOUNT IS INACTIVE IN THIS MOMENT" +
                    "\n------------------------------------------" +
                    "\nDeposit more money to make withdraw.");
        }else
        super.withdraw(amount);
        his.add("withdraw : " + amount +" Birr");
        System.out.print("Enter the date : ");
        String date = new Scanner(System.in).nextLine();
        this.date.add(date);
    }

    public void monthlyProcess(){

        if(getNumWithdraw() > 4){
            int num  = getNumWithdraw() - 4;
            super.monthlyProcess(num);
            his.add("charge : " + super.getSerCharge() +" Birr");
        }
        isStatus();
    }


    public boolean isStatus(){

        if(getBalance() >= 25)
            this.status = true;
        else
            this.status = false;

        return this.status;
    }

    /* To show all the information about the account
     */
    public String toString(){

        System.out.println("Transaction info:");
        history();
        System.out.println("\n\tREMAINING BALANCE : " + super.getBalance() + " Birr");

        return"";
    }

    public String history(){

        for(int i=0;i < his.size();i++){
            System.out.println("    " + his.get(i) + "  at " + date.get(i));
        }
        return "";
    }

}
