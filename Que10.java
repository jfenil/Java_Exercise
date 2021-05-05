import java.util.ArrayList;
import java.util.Collections;

public class Que10 
{
    public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<String>();
        list.add("Fenil");
        list.add("Jain");
        list.add("Srey");
        list.add("Patel");
        list.add("Royal");
        System.out.println("Before Shuffling:");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println("After Shuffling:");
        System.out.println(list);
    }
}