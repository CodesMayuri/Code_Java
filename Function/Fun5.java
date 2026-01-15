//Q5. Write a java program to print all odd numbers between 1 to 100.

public class Fun5
{
  public static void main(String args[])
  {
   oddNum();
  }
  public static void oddNum()
  {
   int i=1;
   while(i<=100)
  {
   if(i%2!=0)
   {
    System.out.print(i+" ");
    }
    i++;
  }
  }
}
