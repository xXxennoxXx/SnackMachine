import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Tests {

    @Test
    public void lists(){

        Random random = new Random();

        List<Integer> list = new LinkedList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        list.forEach(e-> System.out.println(e.toString()));

    }
}
