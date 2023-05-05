import java.util.HashSet;

public class LearnHashSet {
    public static void main(String[] args) {
        // set will not allow duplicate elements, and order is not defined because of hashing. O(1) -> constant time complexity.

        HashSet<Integer> set = new HashSet<>();
        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
        set.add(54);// it will not get added
        System.out.println(set);

        set.remove(65); // it will remove given element
        System.out.println(set);

        System.out.println(set.contains(2)); // it will return boolean values based on element
        System.out.println(set.isEmpty()); // it checks if set is empty
        System.out.println(set.size()); // it gives size of set

        set.clear(); // removes all elements in set
        System.out.println(set);


    }
}
