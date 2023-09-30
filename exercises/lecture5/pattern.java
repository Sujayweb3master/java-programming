public class pattern {
    public static void main(String arg[]) {

        //1.  Solid Rhombus
        System.out.println("Solid Rhombus:");
        int n1 = 5;
        //outer loop
        for(int i=1; i <= n1; i++) {
            //inner loop 1
            for(int j=1; j <= n1-i; j++) {
                System.out.print(" ");
            }
            //inner loop2
            for(int j=1; j <= n1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //1.  Number pyramid
        System.out.println("Number Pyramid:");
        int n2 = 5;
        //outer loop
        for(int i=1; i <= n2; i++) {
            //inner loop 1
            for(int j=1; j <= n2-i; j++) {
                System.out.print(" ");
            }
            //inner loop2
            for(int j=1; j < (2 * i) ; j++) {
                if(j % 2 != 0) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}