import java.util.*;

public class clasroom {
    public static boolean isAnagram(String s, String t){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            if(map.get(c) != null){
                if(map.get(c) == 1){
                 map.remove(c);
                 }else{
                    map.put(c, map.get(c) - 1);
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
    public static void main(String[] args){
        String s="tulip";
        String t="pulit";
        System.out.println(isAnagram(s, t));
    }


    //     int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};

    //     HashMap<Integer, Integer> map = new HashMap<>();

    //     for (int i = 0; i < arr.length; i++) {
    //         map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    //     }

    //     for (Integer key : map.keySet()) {
    //         if (map.get(key) > 1) {
    //             System.out.println(key + " " + map.get(key));
    //         }
    //     }
    // }
}
