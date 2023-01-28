package ATMapplication;

public class Main {

    public static void main(String[] args){

        AccountInformation account = new AccountInformation("Talha Zeren","456930",4000);

        ATM atm = new ATM();
        atm.work(account);

    }
}
