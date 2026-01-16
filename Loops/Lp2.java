//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.
 
import java.util.Scanner;
class Lp2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>=1)
        { 
            System.out.println(n);
            n--;
        } 
    }
}

