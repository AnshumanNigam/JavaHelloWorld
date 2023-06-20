import java.util.Scanner;
public class Arrays
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int i;
        int [] array=new int[5];
        for(i=0;i<array.length;i++)
        {
             System.out.println("Enter value of ---> "+(i+1)+" element");
             array[i]=ob.nextInt();
        }
        int sum=0,min=array[0],max=0;
        double average=0;
        for(i=0;i<array.length;i++)
        {
            sum=sum+array[i];
            average=(double)sum/array.length;
        }
        System.out.println("Sum of all elements of array ==>"+sum);
        System.out.println("Average of all element of array ==>"+average);

        for(i=0;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
            else if(array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println("Maximum element of array---->"+max);
        System.out.println("Minimum element of array---->"+min);
        ob.close();
    }
}