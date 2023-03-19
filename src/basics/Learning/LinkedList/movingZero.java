package src.basics.Learning.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class movingZero {
    public static void main(String[] args) {
        LinkedList<Integer>ln=new LinkedList<>();
        ln.add(0);
        ln.add(1);
        ln.add(0);
        ln.add(1);
        ln.add(0);
        ln.add(2);

        for(int e:ln){
            System.out.println(e);
        }

    }

}
