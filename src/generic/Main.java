package generic;

import javax.naming.InitialContext;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        List<String> names = new ArrayList<>();
//        names.add("Ola");
//        names.add("Ala");
//        names.add("Zuza");
//        names.add("ania");
//        getInDescOrder(names).forEach(s -> System.out.println(s));
//
//
//    }
//    private static List<String> getInDescOrder(List<String> list) {
//        return list.stream().
//                .sorted((s1, s2) -> s2.compareTo(s1))
//                .collect(Collectors.toList());

        Map<String, Integer> value = new TreeMap<>();
        value.put("Jan",123);
        value.put("Zbigniew",456);
        value.put("John", 342);
        value.put("Rambo",654);
        value.put("Bibi", 56654);

        Set<String> keySet = value.keySet();
        System.out.println("Klucze:\n" + keySet);
        Collection<Integer> values = value.values();
        System.out.println("Wartości:\n" + values);

        public  static void display(Map<String, Integer> value){
        Set<Map.Entry<String, Integer>> entrySet = value.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {

            System.out.println("Klucz: " + entry.getKey() + " : " + "Wartość: " + entry.getValue() + ",");
        }
        }

    }
}
