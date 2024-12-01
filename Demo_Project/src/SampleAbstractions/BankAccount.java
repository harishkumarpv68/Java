package SampleAbstractions;

abstract class BankAccount {

    public abstract void deposit(double amount);
    public abstract double balanceAmount();
    public abstract void minStatement();
}

class SavingsAccount extends BankAccount {

    private double balance;

    public SavingsAccount(){
        this.balance = 0.0;
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Deposit amount is :" + amount );
        //System.out.println("Total Balance is : " + balance);
    }

    public double balanceAmount(){
        System.out.println("Account Balance is : " + balance );
        return balance;
    }

    public void minStatement() {
        System.out.println("Display last 5 Transactions details");
    }
}

class AccountHolder extends SavingsAccount {

    public static void main(String[] args) {

        SavingsAccount sb = new SavingsAccount();
        sb.deposit(1000);
        sb.balanceAmount();
        sb.minStatement();

    }
}




