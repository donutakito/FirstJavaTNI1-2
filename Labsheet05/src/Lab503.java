import java.util.Locale;
import java.util.Scanner;

public class Lab503 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message: ");
        String msg = sc.nextLine();
        System.out.println();
        System.out.println("List of vowel in \""+msg+"\"");
        System.out.println("The letter 'A' appears "+count_vowel(msg,'A')+" time(s).");
        System.out.println("The letter 'E' appears "+count_vowel(msg,'E')+" time(s).");
        System.out.println("The letter 'I' appears "+count_vowel(msg,'I')+" time(s).");
        System.out.println("The letter 'O' appears "+count_vowel(msg,'O')+" time(s).");
        System.out.println("The letter 'U' appears "+count_vowel(msg,'U')+" time(s).");
    }

    static int count_vowel(String message,char letter){
        int count = 0;
        message = message.toUpperCase();
        for (int i=0;i<message.length();i++)
        {
            if (letter==message.charAt(i))
            {
                count++;
            }
        }
        return count;
    }
}
