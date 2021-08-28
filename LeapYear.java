import java.util.Scanner;
class LeapYear
{
  public static void main(String[]args)
  {
   Scanner s=new Scanner(System.in);
   System.out.println("Enter year");
   int year=s.nextInt();
  
   if(year%4==0)
   {
     if(year%100==0)
     {
       if(year%400==0)
      {
       System.out.println("year is leap");
      }
       else
      {
       System.out.println("year is not leap");
      }
      
      System.out.println("year is leap");
     }
     System.out.println("year is not leap");
   }
  }
}