/*Q2. Write a Java program to calculate the sum of all elements in an array.
Input:
 Array Size = 5
 Array Elements = 2 4 6 8 10
Output:
 Sum of array elements = 30
Explanation:
•	Initialize a variable sum = 0.
•	Traverse the array and keep adding each element to sum.
•	After the loop ends, sum will hold the total of all array elements.
 */
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
