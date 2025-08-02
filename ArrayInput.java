import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {

 /*int[] numbers = new int[5]; 

numbers[0] = 10;
numbers[1] = 20;
numbers[2] = 30;
numbers[3] = 40;
numbers[4] = 50;*/

        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("You entered:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
