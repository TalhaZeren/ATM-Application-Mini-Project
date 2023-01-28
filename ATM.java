package ATMapplication;

import java.util.Scanner;

public class ATM {
        Scanner scanner = new Scanner(System.in);
        int select;
        String a;
        int amount;
    public void work(AccountInformation account){
        Login entering = new Login();
        System.out.println("Welcome to our Bank!!");
            System.out.println("************************");
                System.out.println("User Login :");
            System.out.println("************************");
        int RightOfLogin = 3;
        while(true){
            if(entering.enter(account)){
                System.out.println("User login Successful!\n\n");
            break;
            }
            else{
                System.out.println("User Login is Failed. Please try again :");
                RightOfLogin--;
            }
            if(RightOfLogin == 0){
                System.out.println("Your Right of login finished. Please take your card.");
                return;
            }
        }

        String transactions = "1) viewing my salary\n" +
                              "2) withdrawal the money\n" +
                              "3) invesment the money\n" +
                              "4) Click to 'q' for quit\n";

    while(true){
                System.out.print("\nPlease, click an options :\n");
                  System.out.println(transactions);
                      select = scanner.nextInt();
            if(select == 1){
                    System.out.print("Your Salary :"+account.getSalary());
                        System.out.println("\nWould you like to continue ? ");
                                scanner.nextLine();
                             a = scanner.nextLine();
                if(a.equals("y")){
                        continue;
                    }
                    else if(a.equals("n")){
                        break;
                    }
                }
            else if(select == 2){
                    System.out.print("How much withdrawal do you want to your account?  please write  : ");
                      amount = scanner.nextInt();
                         account.withdrawal(amount);
                    System.out.println("\nWould you like to continue ? ");
                    scanner.nextLine();
                             a = scanner.nextLine();
                    if(a.equals("y")){
                            continue;
                        }
                    else if(a.equals("n")){
                            break;
                        }
                }
            else if(select == 3){
                System.out.print("How much invest do you want to your account? please write :");
                amount = scanner.nextInt();
                account.invesment(amount);
                System.out.println("\nWould you like to continue ? ");
                scanner.nextLine();
                a = scanner.nextLine();
                if(a.equals("y")){
                    continue;
                }
                else if(a.equals("n")){
                    break;
                }
            }
            else if(select == 4){
                break;
            }
            else{
                System.out.println("Please enter a defined value...");
                continue;
            }
        }




    }

}
