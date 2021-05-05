import java.util.ArrayList;

public class Que15 
{
    public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<String>();
        list.add("Fenil");
        list.add("Jain");
        list.add("Srey");
        list.add("Patel");
        list.add("Royal");
        System.out.println("before joining list: "+list);
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("Hansaj");
        list1.add("Raj");
        list1.add("Maharshi");
        System.out.println("before joining list1: "+list1);
        list.addAll(list1);
        System.out.println(" after joining list1 to list: "+list);
    }
}