import javax.swing.*;

public class Ex203 {
    public static void main(String[] args) {

        final int lecturePrice = 1900,labPrice = 3500; //final = กำหนดค่าที่เปลี่ยนแปลงไม่ได้

        int lecCredit = Integer.parseInt(JOptionPane.showInputDialog("Enter lecture credit :"));
        int lecPrice = Integer.parseInt(JOptionPane.showInputDialog("Enter lecture price :"));

        JOptionPane.showMessageDialog(null,"Lecture:"+lecCredit);


    }
}
