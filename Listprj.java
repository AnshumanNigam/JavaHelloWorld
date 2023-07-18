import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Listprj {
    public static void main(String args[])
    {
        Scanner object=new Scanner(System.in);
        List<String> grocery = new ArrayList<>();
        grocery.add("Milk");
        grocery.add("Eggs");
        grocery.add("Bread");
        grocery.add("Sweets");
        System.out.println("Current items in the list is--->");
        System.out.println(grocery + "\n");
        System.out.println("Enter item that you want to remove from list");
        String a=object.nextLine();
        grocery.remove(a);
        System.out.println("Updated grocery list--->" + "\n");
        System.out.println(grocery + "\n");
        System.out.println("Enter item to check in the list--->" + "\n");
        String b=object.nextLine();
        boolean contains=grocery.contains(b);
        System.out.println("The list contains "+ b +"--->"+contains + "\n");
        grocery.clear();
        boolean clearr=grocery.isEmpty();
        System.out.println("Is the grocery list empty--->" + clearr + "\n");
        object.close();
}
}
