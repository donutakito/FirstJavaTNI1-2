import javax.swing.*;

public class CakeOrder3 extends Bakery{
    static void main() {

        double pound = Double.parseDouble(JOptionPane.showInputDialog("How many pounds do you want?"));
        String flavor = JOptionPane.showInputDialog("Enter a flavor birthday cake:");
        String msgOnCake = JOptionPane.showInputDialog("Enter a message on cake:");
        BirthdayCake cakeOrder;

        while(true) { //วนจนกว่าจะกดYES
             cakeOrder = new BirthdayCake(msgOnCake,pound,flavor,400); //รอเรียกBirthdayCakeเเล้วก็ส่งค่าต่างๆไปในmethodที่อยู่ในนั้น
            int confirmOrder = JOptionPane.showConfirmDialog(null, cakeOrder + "\n\nConfirm this order?",
                    "Select an Option", JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirmOrder==JOptionPane.YES_OPTION)break; //ถ้ากดyes=break
            msgOnCake = JOptionPane.showInputDialog("Enter a new message for changing:");
        }
        JOptionPane.showMessageDialog(null, cakeOrder);//เเสดงผลลัพ

    }
}
