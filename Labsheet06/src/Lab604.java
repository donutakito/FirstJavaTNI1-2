import java.util.Scanner;

public class Lab604 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {47,13,82,17,61,29,94,36};
        display_array(numbers);
        int index = input_index(numbers); //เก็บค่าที่ต้องการหาไว้ในตัวแปรนี้
        System.out.println();
        System.out.println("The number at index "+index+" is "+numbers[index]);

        System.out.println("The number before index "+index+" is "//before
                +(check_index(numbers,index-1)?"Out of range!!":numbers[index-1]));

        System.out.println("The number after index "+index+" is " //after
                +(check_index(numbers,index+1)?"Out of range!!":numbers[index+1]));

    }

    static void display_array(int[]numbers) //เเสดงข้อมูลทั้งหมดที่รับมา
    {
        System.out.print("List of number in array: ");
        for (int num:numbers)
        {
            System.out.print(num+" ");
        }
    }

    static int input_index(int[]numbers) //รับค่าindexที่ต้องการหาผ่านconsole ถ้ามัน<0หรือ>จำนวนข้อมูลให้วนรับใหม่
    {   Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter index: ");
        int num = sc.nextInt();
        while (check_index(numbers,num))
        {
            System.out.print("Invalaid Index!! Enter index ,again: ");
             num = sc.nextInt();
        }
        return num;
    }

    public static boolean check_index(int[]numbers,int index)
    {
        return index < 0 || index >= numbers.length;
    }
}
