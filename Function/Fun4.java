//Q4. Write a java program to print all even numbers between 1 to 100.- using while loop

public class Fun4
{
  public static void main(String args[])
  {
   evenNum();
  }
  public static void evenNum()
  {
   int i=1;
   while(i<=100)
  {
   if(i%2==0)
   {
    System.out.print(i+" ");
    }
    i++;
  }
  }
}
