//Q2. Write a Java program to calculate the sum of all elements in an array.
import java.util.Scanner;

class Array2
{
    public static void main(String []args)
    {
        int a[]=new int[5];
        int sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<a.length;i++){
            sum+=a[i];  
        }
        System.out.println("Sum of array elements = "+sum);
    }
}
