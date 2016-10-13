package datastructures;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class InmutableMap {

    private static final Map map;

    static {
        Map<Integer, String> aMap = new HashMap<>();
        aMap.put(1, "one");
        aMap.put(2, "two");
        aMap.put(3, "three");

        map = Collections.unmodifiableMap(aMap);
    }

    public Map getMap() {
        return map;
    }


    public static void main(String[] args) {
        InmutableMap imap = new InmutableMap();

        imap.getMap().put(4, "four");

    }

}
