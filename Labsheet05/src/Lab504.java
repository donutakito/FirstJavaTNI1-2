import java.util.Scanner;

public class Lab504 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Create password:");
        String password = sc.nextLine();

       while(check_password(password))
        {
            System.out.print("Invalaid Password! Create password:");
            password = sc.nextLine();
        }
        System.out.println();

        System.out.print("Enter confirm pasword:");
        String confirmPass = sc.nextLine();

        while (!check_password(password,confirmPass))
        {
            System.out.print("Password do not match! Enter confirm pasword:");
            confirmPass = sc.nextLine();
        }
        System.out.println();
        System.out.println();
        System.out.println("Password set successfully!!!");


    }

    static boolean check_password(String pass)
    {
       if (pass.length()<8)return true;
       else return false;
    }

    static boolean check_password(String pass,String confirm_pass)
    {
       if (pass.equals(confirm_pass))return true;
       else return false;
    }

}
