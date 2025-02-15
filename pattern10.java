import java.util.*;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N:");
        int N = sc.nextInt();
        int iniS = 0;
        for (int i = 0; i < N; i++) {

            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }

            iniS += 2;

            System.out.println();
        }

        iniS = 2 * N - 2;
        for (int i = 1; i <= N; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            iniS -= 2;

            System.out.println();
        }
    }
}
