
import java.util.Map;
import java.util.TreeMap;

public class LearnTreeMap {
    public static void main(String[] args) {
        // TreeMap under the hood implements keys as binary search tree. Keys will be in sorted order. O(logN)
        Map<String, Integer> num = new TreeMap<>();

        num.put("One", 1);
        num.put("Two", 2);
        num.put("Three", 3);

        if (!num.containsKey("Two")) {
            num.put("Two", 23); // it will not get added
        }
        //or
        num.putIfAbsent("Two",23); // alternate to above if statement

        System.out.println(num);

        for (Map.Entry<String, Integer> e : num.entrySet()) {
            System.out.println(e);

            System.out.println(e.getKey()); // print keys
            System.out.println(e.getValue()); // print values
        }
        System.out.println();
        // for printing only keys
        for (String key : num.keySet()) {
            System.out.println(key);
        }
        // for printing only values
        for (Integer val: num.values()) {
            System.out.println(val);
        }

        System.out.println(num.containsKey("One")); // it will print true if key is present
        System.out.println(num.containsValue(3)); // it will print false if value is present
        System.out.println(num.isEmpty()); // it will check if map is empty
        num.clear(); // it will clear the map
        System.out.println(num);
    }
}
