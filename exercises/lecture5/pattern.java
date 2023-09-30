public class pattern {
    public static void main(String arg[]) {

        //1.  Solid Rhombus
        System.out.println("Solid Rhombus:");
        int n = 40;
        for(int i=1; i <= n; i++) {
            
            for(int j=1; j <= n-i; j++) {
                System.out.print(" ");
            }

            for(int j=1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}