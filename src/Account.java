public class Account {
    private int accountNumber;
    private double balance=0.0;

    public Account(int accountNumber , double balance){
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public Account(int accountNumber){
        this.accountNumber=accountNumber;
        balance=0;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void credit(double amount){
        balance = balance + amount;
    }
    public void debit(double amount){
        //balance = balance + amount;
        if (amount> balance){
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        else{
            balance=balance-amount;
        }
    }
    public void print(){
        System.out.println("A/C no: " + accountNumber + " " + "Balance= "+ balance) ;
    }

    @Override
    public String toString() {
        return "A/C no: " + accountNumber + " " + "Balance= "+ balance;
    }
}

