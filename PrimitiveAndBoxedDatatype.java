import java.util.Scanner;
public class PrimitiveAndBoxedDatatype
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name=ob.nextLine();
        System.out.println("Enter Age: ");
        int age=ob.nextInt();
        System.out.println("Hello, "+name+"! You are " +age+ " years old.");
        ob.close();
    }
}