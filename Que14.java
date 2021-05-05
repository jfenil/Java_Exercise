import java.util.ArrayList;
import java.util.Collections;

public class Que14 
{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Fenil");
        list.add("Jain");
        list.add("Srey");
        list.add("Patel");
        list.add("Royal");
        System.out.println("Before Swapping: ");
        System.out.println(list);
        Collections.swap(list, 0, 3);
        System.out.println("After Swapping: ");
        System.out.println(list);
    }
}