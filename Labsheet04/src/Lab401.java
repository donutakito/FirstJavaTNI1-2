import javax.swing.*;
import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class Lab401 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String name;

        do {
            name = JOptionPane.showInputDialog("Enter your full name:").trim();
        }while(!name.contains(" ")); //ถ้าผู้ใช้ไม่ได้กรอกช่องว่าง มันจะวนลุปใหม่เรื่อยๆจนกว่าผู้ใช้จะกรอก

        int spaceName = name.indexOf(" "); //เป็นการเเบ่งช่องว่างคำ
        String firstName = name.substring(0,spaceName); //เป็นการหาชื่อ ซึ่งก็คือindexที่0ไปจนถึงช่องว่าง หรือ space name
        String lastName = name.substring(spaceName+1); // นามสกุลตั้งเเต่space name
        String firstnameUpper = firstName.substring(0,1).toUpperCase()+firstName.substring(1); //ทำให้ชือตำแหน่งเเรกเป็นตัวพิมใหญ่

        JOptionPane.showMessageDialog(null,"Welcome, "+firstnameUpper+" "+lastName.toUpperCase());







    }
}
