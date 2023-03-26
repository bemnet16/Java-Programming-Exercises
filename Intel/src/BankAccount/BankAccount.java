package BankAccount;

public class BankAccount {

    private double balance;         // to hold the saving balance
    private int numDeposit;         //to hold the number of deposit the customer has made in a month
    private int numWithdraw;        //to hold the number of withdraw the customer has made in a month
    private double anInterestRate;  // to hold the annual interest rate of for saving
    private double serCharge;       //to hold the monthly service charge


    public BankAccount(double balance, double anInterest){
        this.balance = balance;
        this.anInterestRate = anInterest;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNumWithdraw() {
        return this.numWithdraw;
    }

    public void setNumWithdraw(int numWithdraw) {
        this.numWithdraw = numWithdraw;
    }

    public double getAnInterestRate() {
        return anInterestRate;
    }

    public double getSerCharge() {
        return serCharge;
    }

    /*to make deposit in a bank account
                      @param amount to hold the amount to be deposited
                     */
    public void deposit(double amount){

        if(amount <= 0){
            System.out.println("Error: you enter incorrect amount please try again.");
            System.exit(0);
        }
        this.balance += amount;
        this.numDeposit++;

    }

    /*to make withdraw in a bank account
     @param amount to hold the amount to be debited
     */
    public void withdraw(double amount){

        if(amount <= 0 || amount > this.balance){
            System.out.println("Error: you enter incorrect amount please try again.");
            System.exit(0);
        }
        this.balance -= amount;
        this.numWithdraw++;

    }

    /* This method is to calculate the monthly interest for
    account balance
     */
    public void calcInterest(){

        double monInterestRate = this.anInterestRate / 12;
        double monInterst = this.balance * monInterestRate;
        this.balance += monInterst;

    }

    public void monthlyProcess(double amount){

        this.serCharge = amount;
        this.balance -= this.serCharge;
        calcInterest();
        this.numDeposit = 0;
        this.numWithdraw = 0;
        this.serCharge = 0;
    }
}
