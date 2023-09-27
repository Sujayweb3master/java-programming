import java.util.*;

public class patterns {
    public static void main (String arg[]) {

        int n = 4; 
        int m = 5;

        // solid rectangle (r=4, c=5)
        System.out.println("Solid Rectangle:");
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    
        // hollow rectangle ()
            // *****
            // *   *
            // *   *
            // *****
        System.out.println("Hollow Rectangle:");

        // for (int i = 1; i <= 4; i++) {

        //     if ((i==1) || (i==4)) {

        //         for (int j = 1; j < 5; j++) {
        //             System.out.print("*");
        //         }

        //     } else {
        //         for (int j = 1; j < 5; j++) {

        //             if ((j==1) || (j==4)) 
        //                 System.out.print("*");
        //               else 
        //                 System.out.print(" ");

        //         }
        //     }
        //     System.out.println("");

        // }

        // Optimized and simplified code to print hollow pattern!!!
        // outer loop 
        for(int i = 1; i <= n; i++) {

            //inner loop
            for (int j = 1; j <= m; j++) {

                if (i==1 || j==1 || i==n || j==m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Half Pyramid
        System.out.println("Half Pyramid:");
        //Outer loop
        for (int i=1; i <= n; i++) {
            //inner loop
            for (int j=1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Inverted Half Pyramid
        System.out.println("Inverted Half Pyramid");
        //outer loop
         for (int i=n; i >= 1; i--) {
            //inner loop
            for (int j=1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}