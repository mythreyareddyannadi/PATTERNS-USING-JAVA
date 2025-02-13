import java.util.Scanner;
public class pattern8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++) {
                System.out.print("* ");
            }
            for(int l = 1; l<=n-i; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }

        for(int i =1; i<n; i++) {
            for(int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k<n-i; k++) {
                System.out.print("* ");
            }
            for(int l = 0; l<i; l++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
