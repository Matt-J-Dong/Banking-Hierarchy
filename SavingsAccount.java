public class SavingsAccount extends BankAccount
{  
    private double interestRate;   
       
    public SavingsAccount(double rate) 
    {  
       super();
       interestRate = rate;     
    }

    public SavingsAccount(double initialDeposit, double rate) 
    {  
        super(initialDeposit);
        interestRate = rate;          
    }

    public void addInterest() 
    {  
        double interest = getBalance()* interestRate / 100;
        super.deposit(interest); 
    }
}

