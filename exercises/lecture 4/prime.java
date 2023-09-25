import java.util.Scanner;

public class prime {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);
        int factor = 0;
        int n = sc.nextInt();
        sc.close(); // always close the scanner!!!

        for (int i = 1; i <=n; i++) {
            if (n%i == 0)
                factor++;
        }

        if (factor == 2) {
            System.out.println("Entered number is a Prime number.");
        } else {
            System.out.println("Not a Prime number.");
        }

    }
}
