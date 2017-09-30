import java.util.Scanner;
public class AvOfInput {
    public static void main(String[] args) {
        int[] a =new int[5];
        System.out.println("Enter 5 numbers: \n");
        Scanner input = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
            sum += a[i];
        }
        float average = sum / a.length;
        System.out.println("Sum : " + sum + "\nAverage: " + average);
    }
}