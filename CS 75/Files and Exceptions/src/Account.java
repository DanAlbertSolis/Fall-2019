public class Account {
    private int acctNumber;
    private String name;
    private double balance;

    public Account(){

    }
    public Account(int acct_number, String name, double balance){
        this.acctNumber = acct_number;
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount){
        if (amount > 0)
            balance += amount;
    }
    public void withdraw(double amount){
        if(amount < balance && amount > 0)
            balance -= amount;
    }
    public double getBalance(){
        return balance;
    }
    public String getName(){
        return name;
    }
    public int getAcctNumber(){
        return acctNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String toString(){

        return acctNumber+":"+name+":"+balance;
    }
}
