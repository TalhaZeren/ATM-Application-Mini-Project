package ATMapplication;

import java.util.Scanner;

public class Login {
    Scanner scanner = new Scanner(System.in);
    String username;
    String password;


    public boolean enter(AccountInformation account){
        System.out.print("Please enter an your user name: ");
         username = scanner.nextLine();
        System.out.print("Please, enter a your password :");
            password = scanner.nextLine();

        if(account.getName().equals(username) && account.getPassword().equals(password)){
            return true;
        }
        else{
            return false;
        }
    }
}
