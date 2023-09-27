import java.util.*;

public class patterns {
    public static void main (String arg[]) {

        // solid rectangle (r=4, c=5)
        System.out.println("Solid Rectangle:");
        for (int i = 0; i < 4; i++) {

            for (int j = 1; j < 5; j++) {
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

        for (int i = 1; i <= 4; i++) {

            if ((i==1) || (i==4)) {

                for (int j = 1; j < 5; j++) {
                    System.out.print("*");
                }

            } else {
                for (int j = 1; j < 5; j++) {

                    if ((j==1) || (j==4)) 
                        System.out.print("*");
                      else 
                        System.out.print(" ");

                }
            }
            System.out.println("");

        }


    }
}