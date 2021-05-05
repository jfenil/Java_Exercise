import java.util.ArrayList;

public class Que2 
{
    public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<String>();
        list.add("fenil");
        list.add("jain");
        list.add("srey");
        list.add("patel");
        list.add("royal");
        for (String iterate : list) 
		{
            System.out.println(iterate);
        }
    }
}