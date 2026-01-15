//Q2. Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.

import java.util.Scanner;
public class Fun2
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
  System.out.print("Enter a number : ");
  int num = sc.nextInt();
   natNum(num);
  }
  public static void natNum(int n)
  {
   while(n>=1)
  {
    System.out.println(n);
    n--;
  }
  }
}
