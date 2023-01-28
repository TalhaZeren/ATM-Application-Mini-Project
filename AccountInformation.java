package ATMapplication;

public class AccountInformation {
    private String name;
    private String password;
    private int salary;


    public AccountInformation(String name,String password,int salary){
        this.name = name;
        this.password = password;
        this.salary = salary;
    }


    public void setName(String name){
        this.name = name;
    }
       public String getName(){
        return this.name;
    }


    public void setPassword(String password){
        this.password = password;
    }
         public String getPassword() {
        return this.password;
    }
        public void setSalary(int salary){
            this.salary = salary;
        }
        public int getSalary(){
            return this.salary;
    }


    public void withdrawal(int money) {
        if(salary - money < 0){
            System.out.println("Don't enough your salary.Money can't be from salary. ");

        }
        else{
            salary = salary - money;
             System.out.print("Updated your salary :" + this.salary);
        }

        }
    public void invesment(int money){
    salary = salary + money;
        System.out.print("Updated your salary :"+this.salary);
    }
}
