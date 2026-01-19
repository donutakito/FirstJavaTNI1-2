import javax.swing.*;

public class RetuenBookTest {
    public static void main(String[] args) {
        Book book = new Book("Java Programing",5);


       while (true) {
           int answer = JOptionPane.showConfirmDialog(null, "Do you want to bowrow/return book?",
                   "Borrow/Return Book", JOptionPane.YES_NO_OPTION);

           if (answer == JOptionPane.YES_OPTION) {
               int choice = Integer.parseInt(JOptionPane.showInputDialog("Press 1 to borrow book\nPress 2 to return book"));
               if (choice == 1) {
                   book.borrowBook();
                   System.out.println("Borrowed 1 books, available " + book.getAvailableBook() + " books.");
                   if (book.getAvailableBook() == 0) {
                       JOptionPane.showMessageDialog(null, "No books available to borrow...",
                               "Warning Message", JOptionPane.WARNING_MESSAGE);
                   }
               } else if (choice == 2) {
                   book.returnBook();
                   System.out.println("Return 1 books, available " + book.getAvailableBook() + " books.");
                   if (book.getAvailableBook() == book.getTotalBook()) {
                       JOptionPane.showMessageDialog(null, "No books available to borrow...",
                               "Warning Message", JOptionPane.WARNING_MESSAGE);
                   }
               }
           } else {
               JOptionPane.showMessageDialog(null, "END PROGRAM!!"); break;
           }

       }

    }
}
