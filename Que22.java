import java.util.ArrayList;

public class Que22 
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
        System.out.println("printing according to position:");
        for (int i = 0; i < list.size(); i++) 
		{
		System.out.println("{"+i+"}"+list.get(i));
        }
    }
}