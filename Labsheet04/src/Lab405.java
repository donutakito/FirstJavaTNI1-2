import java.util.Scanner;

public class Lab405 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input some sentence: ");
        String sentence = sc.nextLine();

        while(!sentence.endsWith(".")) //ถ้าประโยคไมไดีีั้ลงท้ายด้วย .(จุดfull stopนะจ๊ะ) ให้วนนรับไใหม่เรื่อยๆ
        {
            System.out.print("The sentence must end with full stop point: ");
            sentence = sc.nextLine();
        }
        System.out.println();
        String []resultSentence = sentence.split(" ");

        for(String word : resultSentence)
        {
            System.out.println(word);
        }







    }
}
