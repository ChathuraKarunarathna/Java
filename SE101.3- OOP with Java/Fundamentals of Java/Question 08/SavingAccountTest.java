public class SavingAccountTest {

    public static void main(String[] args) {
        SavingAccount.annualInterestRate=0.04f;
        SavingAccount saver1= new SavingAccount(2000);
        saver1.calculateMonthlyInterest();
        System.out.println("New Balance: "+saver1.getSavingBalance());
        SavingAccount saver2= new SavingAccount(3000);
        saver2.calculateMonthlyInterest();
        System.out.println("New Balance: "+saver2.getSavingBalance());
        SavingAccount.modifyInterestRate(5/100f);
        saver1.calculateMonthlyInterest();
        System.out.println();

        System.out.println("New Balances for next month...");
        System.out.println("New Balance: "+saver1.getSavingBalance());
        saver2.calculateMonthlyInterest();
        System.out.println("New Balance: "+saver2.getSavingBalance());

    }
}
