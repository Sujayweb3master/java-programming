import java.util.Scanner;

import javax.sound.midi.Soundbank;

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

        // do while loop
        do {
            System.out.println("output for do while loop!!!");
            System.out.println(i);
        } while(i<n);
        

        //  print sum of first n natural numbers 
        Scanner natural = new Scanner(System.in);
        int t = natural.nextInt();
        int sum = 0;

        for(int j = 1; j < t+1; j++)       
        {
            sum = sum + j;
        }

        System.out.println(sum);

        }
}