/*Q5. Write a Java program to count even & odd values from an array.
Input:
 Array Size = 7
 Array Elements = 12 17 24 39 40 55 70
Output:
 Count of Even Values = 4
 Count of Odd Values = 3
Explanation:
•	Initialize counters: evenCount = 0, oddCount = 0.


•	For each element in the array:


o	If divisible by 2 → increase evenCount.
o	Otherwise → increase oddCount.


•	Final counts are displayed.
*/

import java.util.Scanner;

class Array5
{
    public static void main(String []args)
    {
        int a[]=new int[7];
        int c=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter elements of array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        
        
        for(int i=0;i<a.length;i++)
        {
        if(a[i]%2==0)
        c++;
        }
        
        System.out.printf("Count of Even Values = "+c);
        c=0;
        System.out.println("");
       
        for(int i=0;i<a.length;i++)
        {
        if(a[i]%2!=0)
        c++;
        }
         System.out.printf("Count of Odd Values  = "+c);
    }
}
