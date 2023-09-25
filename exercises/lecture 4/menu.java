import java.util.Scanner;

public class menu {
    public static void main (String arg[]) {
        
        int choice, marks;

        // ------------Using switch CS----------------
        // Scanner sc = new Scanner(System.in);
        // int choice = sc.nextInt();

        // switch(choice) {
        //     case 0: System.out.println("Exited!!");
        //             break;
            // case 1: System.out.println("Enter the marks: ");
            //         marks = sc.nextInt();
            //         if (marks >= 90)
            //             System.out.println("This is good!!!");
            //         else if ((89 >= marks)&&(marks >= 60))
            //             System.out.println("This is also Good !!!");
            //         else if ((59 >= marks) && (marks >= 0)) 
            //             System.out.println("This is Good as well!!!");
            //         else
            //             System.out.println("Invalid marks!");

        //             break;
        //     default: System.out.println("Invalid input"); 
        // }

        //---------Using do while loop -------
        do {

            System.out.println("Please enter 1 to proceed");
            System.out.println("Press 0 to exit.");
            
            Scanner sc = new Scanner(System.in);
            choice = sc.nextInt();

            if (choice == 1){
                System.out.println("Enter the marks: ");
                    marks = sc.nextInt();
                    if (marks >= 90)
                        System.out.println("This is good!!!");
                    else if ((89 >= marks)&&(marks >= 60))
                        System.out.println("This is also Good !!!");
                    else if ((59 >= marks) && (marks >= 0)) 
                        System.out.println("This is Good as well!!!");
                    else
                        System.out.println("Invalid marks!");

            }
        } while ((choice != 0) && (choice == 1));
        

    }
}

