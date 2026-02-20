package Banking;

import java.util.Scanner;

public class BankSystem2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your bank account: ");
        String id = sc.nextLine();

        AccountTransaction account = new AccountTransaction(id);

        if (!account.hasAccountId()) {
            System.out.println("Bank account not found..."); //ถั้าเรายังไม่ได้สร้างบัญชีในsystem1 ก็จะไม่พบ
            return;
        }

       while (true)
       {
           System.out.print("\nPress 1 to deposit" +
                   "\nPress 2 to withdraw" +
                   "\nPress 3 to check balance" +
                   "\nPress 4 to exit\n" +
                   "Enter a menu: ");
           int press = sc.nextInt();

            if (press==1)
            {
                System.out.print("Enter amount to deposit: ");
                double deposit = sc.nextDouble();
                account.deposit(deposit);///ฝากเงิน
                System.out.println("Your balance = " + account.checkBalance());
            } else if (press==2) {
                System.out.print("Enter amount to withdraw: ");
                double wd = sc.nextDouble();
                account.withdraw(wd);//ถอนเงิน
                System.out.println("Your balance = " + account.checkBalance());
            }else if (press==3)
            {
                System.out.println("Your balance = " + account.checkBalance()); //เช็คยอดล่าสุด
            } else if (press==4) {
                System.out.println("Exit...");
                break;
            }
       }

    }
}

