import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class hhashmapsprj {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        HashMap <String,Integer> count=new HashMap <String,Integer> ();
        System.out.println("Enter Paragraph");
        String paragraph=scanner.nextLine();
        String words[]=paragraph.split(" ");
        int frequency;
        for(String word : words)
        {
            word=word.toLowerCase();
            if(!word.isEmpty())
            {
                frequency = count.getOrDefault(word,0);
                count.put(word, frequency + 1);
          
            }
        }
         System.out.println("Word Frequency: \n");
        for (Map.Entry<String,Integer> totalcount : count.entrySet()) {
            String word = totalcount.getKey();
            frequency = totalcount.getValue();
            System.out.println(word + ": " + frequency);
    }
    scanner.close();
    
}
}

