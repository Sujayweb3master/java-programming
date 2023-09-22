import java.util.*;

class FirstClass {
    public static void main(String arg[]) {
        
        //Input
        Scanner  sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);

        Scanner scc = new Scanner(System.in);
        int a = scc.nextInt();
        int b = scc.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }

}