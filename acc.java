public class acc {
    private String name;
    private double balance;

    public acc(String name, double balance)
    {
        this.name=name;

        if(balance>0.0)
            this.balance=balance;
    }
    public void deposit(double depositAmount)
    {
        if(depositAmount>0.0)
            balance=balance+depositAmount;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(String name)
    {
        this.name=name;
    }


}
