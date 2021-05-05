import java.util.ArrayList;
import java.util.Collections;

public class Que11 
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Fenil");
        list.add("Jain");
        list.add("Srey");
        list.add("Patel");
        list.add("Royal");
        System.out.println("Before Reversing: ");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("After Reversing: ");
        System.out.println(list);
    }
}