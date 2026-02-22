import java.util.*;

public class FloatingNumbers {
    static void main(String[] args) {

        Scanner numbers = new Scanner(System.in);

        System.out.println("\n-- Welcome to the calculator of Two Floating Point Numbers --\n");

        System.out.print("Please enter first number: ");
        double num1 = numbers.nextDouble();

        System.out.print("Please enter first number: ");
        double num2 = numbers.nextDouble();

        double product =  num1 +  num2;
        System.out.println("\nThe Product After Calculatng Two Floating Point Numbers: " + product );

    }
}
