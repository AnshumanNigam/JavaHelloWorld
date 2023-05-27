import java.util.Scanner;


public class conditions
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter 1st Number");
        int a=ob.nextInt();
        System.out.println("Enter 2nd Number");
        int b=ob.nextInt();
        int max=0;
        if(a>b)
        {
            max=a;
        }
        else if(a<b)
        {
            max=b;
        }
        
        System.out.println("Larger number is---> "+max);
        ob.close();
    }
}