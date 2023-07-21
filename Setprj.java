import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
public class Setprj {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter series of numbers with spaces between them");
        String series=scanner.nextLine();
        String seriesparts[]=series.split(" ");
        Set<Integer> uniqueNumbers=new HashSet<>();
        for (String numberString : seriesparts) {
            int number = Integer.parseInt(numberString);

            if (uniqueNumbers.contains(number)) {
                System.out.println(number + "====> Duplicate");
            } else 
            {
                uniqueNumbers.add(number);
                System.out.println(number + "====> Unique");
            }
        }

        scanner.close();

    }
    
}
