import java.util.Scanner;

class conditional_statements {
    public static void main(String arg[]) {
        
        Scanner sc = new Scanner(System.in);

        // using if and if else cs.
        // identify even and odd number 
       
        // int n = sc.nextInt();

        // if (n % 2 == 0) {
        //     System.out.println("Even number.");
        // } else {
        //     System.out.println("Odd number.");
        // }

        // // age condition for voting
        // // Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if(age < 10) {
        //     System.out.println("Not elligible for voting.");
        // } else {
        //     System.out.println("Elligible for voting.");
        // }

        //using switch conditional statement.
        int button = sc.nextInt();
        switch (button) {
            case 1: System.out.println("Hello");
                    break;

            case 2: System.out.println("Namaste!!!!");
                    break;

            case 3: System.out.println("Bonjour");
                    break;

            default: System.out.println("Invalid input.");
        }
    }
}