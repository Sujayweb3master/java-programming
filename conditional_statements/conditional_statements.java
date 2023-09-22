import java.util.Scanner;

class conditional_statements {
    public static void main(String arg[]) {
        
        // identify even and odd number 
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();

        if (n % 2 == 0) {
            System.out.println("Even number.");
        } else {
            System.out.println("Odd number.");
        }

        // age condition for voting
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age < 10) {
            System.out.println("Not elligible for voting.");
        } else {
            System.out.println("Elligible for voting.");
        }
    }
}