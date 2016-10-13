package failfastsafe;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIterator {

    public static void main(String[] args) {

        ConcurrentHashMap<String, Integer> ages = new ConcurrentHashMap<>();

        ages.put("Miguel", 29);
        ages.put("Ana", 52);
        ages.put("Leo", 9);
        ages.put("Cristina", 30);

        Iterator<String> it = ages.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();

            System.out.println(key + " : " + ages.get(key));

            ages.put("Carlos", 62);
        }

    }

}
