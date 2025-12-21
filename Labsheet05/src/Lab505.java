import javax.swing.*;

public class Lab505 {
    static void main() {

        String word = JOptionPane.showInputDialog("Enter some word:");
        JOptionPane.showMessageDialog(null,word+" is "+((is_palindrome(word))?" ":"NOT ")+"Palindrome");
    }

    public static boolean is_palindrome(String word)
    {
        word = word.toLowerCase();
        String reverseWord = "";
        for (int i = word.length()-1;i>=0;i--)
        {
            reverseWord+=word.charAt(i);
        }
        return word.equals(reverseWord);
    }
}
