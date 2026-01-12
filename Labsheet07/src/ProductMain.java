import javax.swing.*;

public class ProductMain {
    public static void main(String[] args) {

        Product p1 = new Product();
        JOptionPane.showMessageDialog(null,"Welcome to Product Stock System");

        p1.name=JOptionPane.showInputDialog("Enter product name:"); //ชื่อสินค้า
        p1.price=Double.parseDouble(JOptionPane.showInputDialog("Enter product price per item:")); //ราคาต่อชิ้น
        p1.quantity=Integer.parseInt(JOptionPane.showInputDialog("Enter product stock:")); //สินค้ามีกี่ชิ้น


        p1.showInfo();
        //ต้องการเพิมสินค้าไหม
        int addMore = JOptionPane.showConfirmDialog(null,"Do you want to ad more item?",
                "Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
        if (addMore==JOptionPane.YES_OPTION)
        {
            p1.addStock(Integer.parseInt(JOptionPane.showInputDialog("How many item to add in stock?")));
        }


        //ต้องการเปี่ยนราคาสินค้าไหม
        int changePrice = JOptionPane.showConfirmDialog(null,"Do you want to change price?",
                "Select an Option",JOptionPane.YES_NO_CANCEL_OPTION);
        if (changePrice==JOptionPane.YES_OPTION)
        {
            p1.changePrice(Double.parseDouble(JOptionPane.showInputDialog("How much is the new price per items?")));
        }
        p1.showInfo();









    }



}
