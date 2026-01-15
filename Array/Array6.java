/*Q6. Write a java program to search an element in an array , its element found or not.
Input:
 Array = {10, 20, 30, 40, 50}
 Element to search = 30
Output : Element 30 found at index 2
Explanation :
We traverse the array and compare each element with the search key. If it matches, print "found" with index; otherwise print "not found".
*/

import java.util.Scanner;

class Array6
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of array: ");
        int n = sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter search element: ");
        int s = sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(s==a[i])
            {
                System.out.println("Element "+s+" found at index "+i);
            }
        }
        
    }
}
