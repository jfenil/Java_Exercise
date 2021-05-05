import java.util.ArrayList;

public class Que17 
{
    public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<String>();
        list.add("Fenil");
        list.add("Jain");
        list.add("Srey");
        list.add("Patel");
        list.add("Royal");
        System.out.println(list);
        list.removeAll(list);
        System.out.println("After removing all Elements:");
        System.out.println(list);
    }
}