import java.util.Scanner;

public class Lab504 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Create password: ");
        String pass = sc.nextLine();
        while (check_password(pass))
        {
            System.out.print("Invalaid Password! Create password: ");
            pass = sc.nextLine();
        }
        System.out.println();
        System.out.print("Enter confirm password: ");
        String confirmPass = sc.nextLine();
        while (check_password(pass,confirmPass))
        {
            System.out.print("Passwaord do not match! Enter confirm password: ");
            confirmPass = sc.nextLine();
        }
        System.out.println();
        System.out.print("Password set successfully!!");
    }

    public static boolean check_password(String pass)
    {
        if(pass.length()<8)return true;
        return false;
    }

    public static boolean check_password(String pass,String confirm_pass)
    {
       if (!confirm_pass.equals(pass))return true;
       return false;
    }

}
