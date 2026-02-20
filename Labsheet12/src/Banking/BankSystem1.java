package Banking;

import java.util.Scanner;

public class  BankSystem1 {

    public static String input_account_id() {
        Scanner sc = new Scanner(System.in);
        String id;

        while (true) {
            System.out.print("Enter account id: ");
            id = sc.nextLine();

            if (id.length() == 10){
                return id;
            } else {
                System.out.println("Account id must be 10 characters."); //ถ้าuserกรอกไม่ถึง10ให้วนใหม่นัะ
            }
        }
    }

    public static double input_initial_balance() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter your initial deposit amount: ");
                return Double.parseDouble(sc.nextLine()); //กรอกจำนานเงินที่ต้องการฝาก
            } catch (Exception e) {
                System.out.print("Try again!!");
            }

        }
    }

    public static void main(String[] args) {

        String account_bank = input_account_id();
        double initial_balance = input_initial_balance();

        OpenNewAccount account = new OpenNewAccount(account_bank, initial_balance);

        System.out.println(account.recordAccount()); //ถัาidซ้ำก็จะขึ้นว่ามันสร้างเเล้ว เเต่ถ้าสร้างใหม่ก็จะขึ้นว่าสร้างสำเร็จ
    }

}
