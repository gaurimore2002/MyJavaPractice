import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // For Loop
        System.out.println("For Loop:");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of iterations for the loops: ");
        int g = scanner.nextInt();
        for (int i = 1; i <= g; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Enter the number of iterations for the loops: ");
        int h = scanner1.nextInt();
        int j = 1;
        while (j <= h) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Enter the number of iterations for the loops: ");
        int l = scanner2.nextInt();
        int k = 1;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k <= l);
    }
}