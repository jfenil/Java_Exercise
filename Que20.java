import java.util.ArrayList;

public class Que20 
{
    public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<String>();
        list.add("Fenil");
        list.add("Jain");
        list.add("Srey");
        list.add("Patel");
        list.add("Royal");
	list.ensureCapacity(8);
        list.add("Technosoft");
        list.add("ltd");
        list.add("LJ");
        System.out.println("after increasing size of list: "+list);
    }
}
