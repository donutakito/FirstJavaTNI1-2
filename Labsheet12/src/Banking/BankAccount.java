package Banking;

public class BankAccount {
    private String accId;
    private double accBalance;
    private final String filename = "src/users_account.txt";

    BankAccount(String accId, double accBalance)
    {
        this.accId=accId;
        this.accBalance=accBalance;
    }

    BankAccount(String accId)
    {
        this(accId,0.0);
    }

    BankAccount()
    {
        this("",0.0);
    }

    String getAccId()
    {
        return this.accId;
    }

    void setAccBalance(double accBalance)
    {
        this.accBalance=accBalance;
    }

    double getAccBalance()
    {
        return this.accBalance;
    }

    String getFilename()
    {
        return this.filename;
    }

    @Override
    public String toString() {
        return this.accId+","+this.accBalance;
    }
}
