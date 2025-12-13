import java.util.Scanner;

public class Lab404 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        String word ="",wordToStop="stop",result="";

        while(true)
        {
          System.out.print("Enter word: ");
          word = sc.nextLine();
            if(word.equalsIgnoreCase(wordToStop))
            {
                System.out.print(result);
                break;
            }
          result += word+" ";
        }

    }
}
