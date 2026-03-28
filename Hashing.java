import java.util.*;
public class Hashing{
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("One", 1);
        hm.put("India",100);
        hm.put("China", 150);
        hm.put("USA", 50);
        // System.out.println(hm);
        // // //get its no exist then return null
        // // int population= hm.get("India");
        // // System.out.println(population);
        // // //contains key or not
        // // System.out.println(hm.containsKey("India"));
        // // System.out.println("indonese population: "+hm.get("Indonesia"));
        // // //remove key value pair
        // System.out.println(hm.remove(key: "One"));
        // System.out.println(hm); 
        //Iterate over the hashmap
        Set<String> keys= hm.keySet();
        System.out.println("Keys: " + keys);
        for(String key: keys){
            System.out.println("Key: " + key + ", Value: " + hm.get(key));
        }
    }
}