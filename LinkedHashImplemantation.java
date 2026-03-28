import java.util.*;
public class LinkedHashImplemantation{
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("india",100);
        linkedHashMap.put("usa",200);
        linkedHashMap.put("china",300);

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",  100);
        hm.put( "China", 150);
        hm.put( "US",  50);

        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India",  100);
        tm.put( "China", 150);
        tm.put( "US",  50);


        System.out.println(linkedHashMap);
        System.out.println(hm);
        System.out.println(tm);
    }

}