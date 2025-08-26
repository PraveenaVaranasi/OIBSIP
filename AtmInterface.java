import java.util.Scanner;
class AtmInterface{
    public static void main(String args[]) {
        int balance=5000,withdraw,deposit;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n");
            System.out.println("---------------ATM MACHINE-------------------");
            System.out.println("Enter 1 for \"WITHDRAW\"");
            System.out.println("Enter 2 for \"DEPOSIT\"");
            System.out.println("Enter 3 for \"CHECK BALANCE\"");
            System.out.println("Enter 4 for \"EXIT\"\n");
            System.out.println("Choose the operation:");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                System.out.print("Enter money to be withdraw:");
                withdraw=sc.nextInt();
                if(balance>=withdraw){
                    balance = balance - withdraw;
                    System.out.println("\n\n------------------Please collect your money-----------------------");
                }
                else{
                    System.out.println("-----------------Insufficient Balance-----------------");
                    System.out.println("\n\nplease check your Balance");
                }
                System.out.println("");
                break;
                case 2:
                System.out.print("Enter money to be deposited:");
                deposit=sc.nextInt();
                balance = balance + deposit;
                System.out.println("\n\n--------------------Your Money has been successfully deposited--------------------");
                System.out.println("");
                System.out.println("Check your balance using \"CHECK BALANCE\"");
                break;
                case 3:
                System.out.println("Balance : "+balance);
                System.out.println("");
                break;
                case 4:
                System.exit(0);
                sc.close();
            }
        }
    }
}