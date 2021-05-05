import java.util.*;

public class Que19 
{
    public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<String>(20);
         list.add("Fenil");
        list.add("Jain");
        list.add("Srey");
        list.add("Patel");
        list.add("Royal");
        System.out.println(list);
        System.out.println("list having size:"+list.size());
        list.trimToSize();
        System.out.println("List size after trimming:"+list.size());
        System.out.println(list);
    }
}