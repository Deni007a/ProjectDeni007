package OOP.Them17.Laba7;

/**
 * Created by Den on 29.03.2017.
 */
public class BankTest {
    public static final int N_ACCOUNTS = 5;
    public static final int INIT_BALANCE = 1000;

    public static void main(String args[]) { //... // COMPLETE //..

        Bank bank = new Bank(N_ACCOUNTS,INIT_BALANCE);
        Transfer transfer = new Transfer(bank,5,10);

        /*
        while (true) {
            bank.transfer(4, 4, 4);
        }
        */

    }
}