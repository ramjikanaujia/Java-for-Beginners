import java.util.Scanner;
class Palindrome
{
 public static void main(String[]args)
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter no");
  int no=s.nextInt();
   int temp=no;
   int rev=0,rem;
   while(temp!=0)
    {
      rem=temp%10;
      rev=rev*10+rem;
      temp=temp/10;
    }
   if(no==rev)
    {
     System.out.println("palindrome number");
    }
    else
    {
     System.out.println("not palindrome number");
    }
 }
}
     