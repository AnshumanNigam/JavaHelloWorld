import java.util.Scanner;
public class Calculator
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter First Number");
        double a=ob.nextInt();
        System.out.println("Enter Second Number");
        double b=ob.nextInt();
        System.out.println("Enter operations +,-,/,*");
        char c=ob.next().charAt(0);
        double result=0.0;
        switch (c){
            case '+':
            {
                result=a+b;
                break;
            }
            case '-':
            {
                result=a-b;
                break;
            }
            case '/':
            {
                if(b==0)
                {
                    System.out.println("Invalid input (Divison by zero)");
                }
                else{
                    result=a/b;
                }
                break;
            }
            case '*':
            {
                result=a*b;
                break;
            }
            default:
            System.out.println("Invalid input");
            break;
        }
        System.out.println("Final result----> "+result);
    } 
}