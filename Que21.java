import java.util.ArrayList;

public class Que21 
{
    public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<String>();
        list.add("Fenil");
        list.add("Jain");
        list.add("Srey");
        list.add("Patel");
        list.add("Royal");
        System.out.println("Before Replacing: "+list);
        list.set(2, "Technosoft");
        System.out.println("After Replacing: "+list);
    }
}