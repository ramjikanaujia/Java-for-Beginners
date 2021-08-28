import java.util.Scanner;
 class User
 {
  public static void main(String[]args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter your Boys Name");
    String Boys_Name=s.next();
    System.out.println("Enter Boys Zodiac");
    String Boys_Zodiac=s.next();
    System.out.println("Enter Boys Age");
    int Boys_Age=s.nextInt();
    System.out.println("Enter your Girls Name");
    String Girls_Name=s.next();
    System.out.println("Enter Girls Zodiac");
    String Girls_Zodiac=s.next();
    System.out.println("Enter Girls Age");
    int Girls_Age=s.nextInt();
    System.out.println("MARRIAGE CONFIRM");
    String Marriage_Status=s.next();

    System.out.println("--------");

    System.out.println("Boys_Name="+Boys_Name);
    System.out.println("Boys_Zodiac="+Boys_Zodiac);
    System.out.println("Boys_Age="+Boys_Age);
    System.out.println("------------------------");
   
    System.out.println("------------------------");
    System.out.println("Girls_Name="+Girls_Name);
    System.out.println("Girls_Zodiac="+Girls_Zodiac);
    System.out.println("Girls_Age="+Girls_Age);
    System.out.println("------------------------");

    System.out.println("Marriage_Status="+Marriage_Status);
  }
}

