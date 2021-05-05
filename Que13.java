import java.util.ArrayList;

public class Que13 
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
        ArrayList<String> list2 = new ArrayList<String>();
        list.add("Fenil");
        list.add("Jain");
        list.add("Srey");
        list.add("Patel");
        list.add("Royal");
        System.out.println("comparing list: ");
        boolean compare = list.equals(list2);
        System.out.println(compare);
       
    }
}