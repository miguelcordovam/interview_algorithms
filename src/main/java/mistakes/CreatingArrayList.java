package mistakes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreatingArrayList {

    public static void main(String[] args) {

        String[] names = {"Miguel", "Claudia", "Cristina"};

//        List<String> list = Arrays.asList(names);

        List<String> list = new ArrayList<>(Arrays.asList(names));

        list.add("Ana");

        list.stream().forEach(System.out::println);

    }

}
