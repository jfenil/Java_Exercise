import java.util.ArrayList;

public class Que12 
{
    public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<String>();
	list.add("Fenil");
        list.add("Jain");
        list.add("Srey");
        list.add("Patel");
        list.add("Royal");
        System.out.println("Complete list: ");
        System.out.println(list);
        System.out.println("Portion of a list: ");
        System.out.println(list.subList(0, 2));
    }
}