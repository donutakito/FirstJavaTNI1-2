package WriteFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteFile {
    static String input_user(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String userName = sc.next();
        System.out.print("Enter Password: ");
        String userPass = sc.next();
        System.out.print("Enter Gender: ");
        String userGender = sc.next();
        System.out.print("Enter BirthYear: ");
        String userBirthYear = sc.next();

        return userName+","+userPass+","+userGender+","+userBirthYear;
    }

    static void main() throws IOException,Exception {
        String data = input_user(); //เรียกใช้methodบน

        FileWriter filename = new FileWriter("src/WriteFile/users2.txt",true);
        PrintWriter writer = new PrintWriter(filename); //เปิดไฟล์

        writer.println(data);//เขียนไฟล์

        writer.close();//ปิดไฟล์
    }
}
