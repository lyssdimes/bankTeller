package bankteller;

public class Account {
    private String accountNumber;
    private String accountType;
    private double accountBalance;

    public Account(String accountNumber, String accountType, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public Account() {
        accountNumber = "";
        accountType = "";
        accountBalance = 0;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void deposit(double amount){
        accountBalance += amount;
    }

    public void withdraw(double amount){
        accountBalance -= amount;
    }

    public String checkAccountBalance(){
        String result = "";
        result += accountBalance;
        return result;
    }

}
