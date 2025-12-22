import java.util.Random;
import java.util.Scanner;

public class Lab603 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your guess (0-20): ");
        int guess = sc.nextInt(); //รับค่าว่าต้แงการเดาเลขอะไร
        System.out.println();
        int[] numbers = random_array(); //เรียกใช้methodสุ่มตัวเลขมา10ตัวเเล้วเก็บไว้ในตัวแปร []numbers 10 เลข
        int sameNumber = count_element(numbers,guess);//เรียกmethodเพื่อหาว่าเราสุ่มได้เลขซ้ำหรือไม่

      if (sameNumber>0)
      {
          System.out.println("Congratulation!! "+guess+" is an element in the array!!");
          if (sameNumber>1)
          {
              System.out.println("Fantastic!!! It also appears more than once!!");
          }
      } else {
          System.out.print("Sorry, try again next time...\n" +
                  "Here are the elements in the array: ");
          display_array(numbers); //เเสดงเลขทั้งหมดที่สุ่มได้

      }

    }

    public static int[] random_array()
    {
        Random random = new Random(); //import random
        int[] numbers = new int[10]; //สร้างช่องไว้10ช่องสำหรับnumbers เเต่ละค่ายังเท่ากับ0นะจ๊ะ
        for (int i=0;i< numbers.length;i++)
        {
            numbers[i] = random.nextInt(21); //สุ่มเลข0-20ให้numbersเสร็จเเล้วเก็บค่าไว้ในnumbersจนครบ10รอบ
        }
        return numbers;
    }

    static int count_element(int[]numbers,int userguessNum)
    {
        int count = 0;
        for (int num :numbers )
        {
            if (num==userguessNum)count++; //มาหาว่าnumbers10ช่องเนี่ย มีตัวไหนบ้างที่เท่ากับเลขที่เดากรอกถ้าตรงให้Count+1
        }
        return count;
    }

    static void display_array(int[]number)
    {
        for (int num:number)
        {
           System.out.print(num+" ");
        }
    }
}
