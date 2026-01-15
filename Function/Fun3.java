//Q3. Write a java program to print all alphabets from a to z. - using while loop


public class Fun3
{
  public static void main(String args[])
  {
   allAlphabet();
  }
  public static void allAlphabet()
  {
   char ch='a';
   while(ch<='z')
  {
    System.out.print(ch+" ");
    ch++;
  }
  }
}
