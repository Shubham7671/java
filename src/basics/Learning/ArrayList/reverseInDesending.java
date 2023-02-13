package src.basics.Learning.ArrayList;
import java.util.*;

public class reverseInDesending {
    public static void DecOrder(ArrayList<Integer> list)
    {
        Collections.sort(list, Collections.reverseOrder());
    }
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        DecOrder(al);
        System.out.println(al);
    }
}
