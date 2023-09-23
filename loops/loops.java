import java.util.Scanner;

class loops {
    public static void main(String arg[]) {
        // for loop, while loop, do while loop

        //for loop
        for(int counter = 0; counter<10; counter++) 
            System.out.println("I am capable of anything !!!!!");

        //while loop
        int i = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(i < n) {
            System.out.println(i);
            i++;
        }
    }
}