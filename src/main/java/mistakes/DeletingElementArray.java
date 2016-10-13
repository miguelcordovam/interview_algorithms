package mistakes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DeletingElementArray {

    public static void main(String[] args) {

        List<String> characters = new ArrayList<>(Arrays.asList("a","b","c","d"));

//        for (int i = 0; i < characters.size(); i++) {
//            characters.remove(i);
//        }

//        for(String s: characters) {
//            if (s.equals("a")) {
//                characters.remove(s);
//            }
//        }

        Iterator<String> iter = characters.iterator();

        while (iter.hasNext()){
            String s = iter.next();

            if(s.equals("a")) {
                iter.remove();
            }
        }


        System.out.println(characters);
    }
}
