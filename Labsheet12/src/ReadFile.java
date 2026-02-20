import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
    static void main()  throws IOException,Exception {

        File filename = new File("src/users.txt");
        Scanner sc = new Scanner(filename);

        while (sc.hasNext()){

            String[]data=sc.nextLine().split(",");
                String userName = data[0];
                String passWord = data[1];
                String gender = data[2];
                int birthYear = Integer.parseInt(data[3]); //แปลงจากstringเป็นint

            System.out.println("User = "+userName);
            System.out.println("Password = "+hide_password(passWord));
            System.out.println("Gender = "+gender);
            System.out.println("Birth Year = "+birthYear);
            System.out.println();

        }
        sc.close();
    }


    static String hide_password(String password)
    {
        String hide_passsword ="";

        for (int i=0;i<password.length();i++)
        {
            if (i==0){
                hide_passsword+=password.charAt(i);
            } else if (i==password.length()-1) {
                hide_passsword+=password.charAt(i);
            }else
                hide_passsword+="*";
        }
        return hide_passsword;
    }
}
