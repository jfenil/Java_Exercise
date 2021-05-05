import java.util.ArrayList;

public class Que18 
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
        if (list.isEmpty() == true)
	{
            System.out.println("list is empty");
	}
        else 
	{
            System.out.println("List is not empty...");   
        }      
    }
}