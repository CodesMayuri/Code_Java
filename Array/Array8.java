/*Q8. Write a java program to find missing elements in an array.
Input : Array = {1, 2, 4, 5, 7} (numbers from 1 to 7 should be present)
Output : Missing elements = {3, 6}
Explanation:
Check sequence numbers one by one. If a number from 1 to maximum (7) is not in the array, it is missing.
*/

import java.util.Scanner;

class Array8
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of array: ");
        int n = sc.nextInt();
        int a[]=new int[n];
        int i,j;
        System.out.println("Enter elements of array");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
      

        int max = a[0];
        int min = a[0];
        for ( i = 0; i < n; i++) {
            if (a[i] < min) {
        min = a[i];
    }
            if (a[i] > max) {
                max = a[i];
            }
        }
        
        System.out.print("Missing elements = { ");
        boolean flag=true;
        
        for (i = min; i <=max; i++) 
        {
            int c=0;
            for(j=0;j<n;j++)
            {
                if (a[j]==i) 
              {   
                c++;
                break;
               }
            }
        
        if(c==0)
        {
            if(flag){
            System.out.print(i);
            flag = false;}
            else
            {
                System.out.print(", "+i);
            }
        }
        }
        System.out.println(" }");
        
    }
}
