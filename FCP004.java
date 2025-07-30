import java.util.Scanner;

public class FCP004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A + B);            // Addition
        System.out.println(A - B);            // Subtraction
        System.out.println(A * B);            // Multiplication
        System.out.println((float) A / B);    // Floating-point Division
        System.out.println(A / B);            // Integer Division
        System.out.println(A % B);            
    }
}
