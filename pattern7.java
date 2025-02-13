import java.util.Scanner;
public class pattern7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();

        for(int i =0; i<n; i++) {
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



