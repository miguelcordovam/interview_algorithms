package failfastsafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIterator {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(66);

        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()){

            Integer integer = it.next();

            numbers.add(14); // throws exception
        }

    }

}
