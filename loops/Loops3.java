import java.util.Scanner;
public class Loops3 
{
   public static void main(String args[])
   {
    Scanner ob=new Scanner(System.in);
    int number;
    System.out.println("This is the usage of Do While loop");
    do{
        System.out.println("Enter number");
        number=ob.nextInt();
    }while(number>=10);
    ob.close();
   } 
}
