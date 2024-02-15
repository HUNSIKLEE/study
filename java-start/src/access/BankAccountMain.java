package access;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount acount = new BankAccount();
        acount.deposit(10000);
        acount.withdraw(3000);
        System.out.println("balance = " + acount.getBalance());
    }
}
