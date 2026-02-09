package Customer;

import javax.swing.*;

public class RestaurantBill {
    public static void main(String[] args) {

        String nameCus = JOptionPane.showInputDialog("Enter customer's name: ");
        double bill = Integer.parseInt(JOptionPane.showInputDialog("Enter customer's bill: "));
        int isMember = JOptionPane.showConfirmDialog(null,"Do you have a member card?"
                ,"Member",JOptionPane.YES_NO_OPTION);

        if (isMember==JOptionPane.YES_OPTION)
        {
            String memberLevel = JOptionPane.showInputDialog("Enter a member level[]Gold/Premuim");
            Member billCus = new Member(nameCus,bill,memberLevel);
            JOptionPane.showMessageDialog(null,billCus);

        }else
        {
            Regular billCus = new Regular(nameCus,bill);
            JOptionPane.showMessageDialog(null,billCus);
        }


    }

}
