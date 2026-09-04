import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int i = 1;

        while (i <= n) {

            // Print spaces
            int space = 1;

            while (space <= n - i) {
                System.out.print("  ");
                space++;
            }

            // Print stars
            int j = 1;

            while (j <= i) {
                System.out.print("* ");
                j++;
            }

            // Move to next line
            System.out.println();

            i++;
        }
    }
}