package BankAccount;

public class BankMain {
    public static void main(String[] args) {

        SavingAccount sa = new SavingAccount(12,6);
        sa.deposit(100);
        sa.withdraw(1);
        sa.withdraw(1);
        sa.withdraw(1);
        sa.withdraw(1);
        sa.withdraw(1);
        sa.withdraw(1);
        sa.monthlyProcess();
        sa.deposit(2000);
        sa.withdraw(300);
        sa.deposit(25);
        System.out.println(sa.toString());
    }
}
