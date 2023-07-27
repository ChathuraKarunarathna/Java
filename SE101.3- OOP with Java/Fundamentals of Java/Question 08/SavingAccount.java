      /*Create class SavingsAccount. Use a static variable annualInterestRate to store the annual interest
        rate for all account holders. Each object of the class contains a private instance variable
        savingsBalance indicating the amount the saver currently has ondeposit. Provide method
        calculateMonthlyInterest to calculate the monthly interest by multiplying the savingsBalance by
        annualInterestRate divided by 12 this interest should be added to savingsBalance. Provide a static
        method modifyInterestRate that sets the annualInterestRate to a new value.
        Write a program to test class SavingsAccount. Instantiate two savingsAccount objects, saver1 and
        saver2, with balances of $2000.00 and $3000.00, respectively. Set annualInterestRate to 4%, then
        calculate the monthly interest and print the new balances for both savers. Then set the
        annualInterestRate to 5%, calculate the next month’s interest and print the new balances for both
        savers*/

public class SavingAccount {
    static float annualInterestRate;
    private float savingBalance;

    public SavingAccount(float savingBalance)
    {
        this.savingBalance=savingBalance;
    }

    public void calculateMonthlyInterest()
    {
        float monthlyInterest= savingBalance*annualInterestRate/12;
        savingBalance+=monthlyInterest;


    }
    static void modifyInterestRate(float newRate) {
        annualInterestRate = newRate;
    }

    public float getSavingBalance() {
        return savingBalance;
    }

}