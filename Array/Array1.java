//Q1. Write a Java program to input an array & display it.

import java.util.Scanner;

class Array1
{
    public static void main(String []args)
    {
        int a[]=new int[5];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Display elements of array");
        for(int i=0;i<a.length;i++){
        System.out.printf("%d\t",a[i]);
            
        }
    }
}
