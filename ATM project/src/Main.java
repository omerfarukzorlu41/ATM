import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password,username;
        int remainder =3,balance = 2000,selection,price;

        while(remainder > 0){
            System.out.print("Please enter a username:");
            username = scanner.nextLine();
            System.out.print("Please enter a password:");
            password = scanner.nextLine();
            if(username.equals("zobzorlu") && password.equals("1793")){
                System.out.println("Congratulations, you are logged in");
                System.out.println("*********************************************");
                System.out.println("1-deposit\n" +
                        "2-withdrawal\n" +
                        "3-balance query\n" +
                        "4-exit");
                System.out.println("********************************************");

                while(true){
                    System.out.print("please select the action you want to take:");
                    selection = scanner.nextInt();
                switch(selection) {
                    case 1:
                        System.out.print("how much will be deposited? : ");
                        price = scanner.nextInt();
                        balance += price;
                        break;
                    case 2:
                        System.out.print("how much money will be withdrawn? : ");
                        price = scanner.nextInt();
                        if (price > balance) {
                            System.out.println("insufficient balance");
                        } else {
                            balance -= price;
                        }
                        break;
                    case 3:
                        System.out.println("balance: " + balance);
                        break;
                    case 4:
                        System.out.println("see you later");
                        System.exit(0);
                    default:
                        System.out.println("Please choose your action from 1 to 4.");
                        break;
                }
                }
            }else{
                remainder--;
                System.out.println("incorrect entry, try again");
                if(remainder == 0){
                    System.out.println("Your account has been blocked. Please contact us.");
                }else{
                    System.out.println("Your remaining right: "+ remainder);
                }
            }
        }
    }
}
