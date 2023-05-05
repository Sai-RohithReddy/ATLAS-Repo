import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class LearnArrayList {
    public static void main(String[] args) {
        // ArrayList are dynamic arrays.
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // for adding elements
        list.add(2);
        list.add(3);
        list.add(5);
        System.out.println(list);

        list.add(3,4); // adding element in specific index
        System.out.println(list);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(100);
        newList.add(200);
        System.out.println(newList);

        list.addAll(newList);// adds new lest to existing one
        System.out.println(list);


        newList.remove(1); // removes specific element in given index
        System.out.println(newList);
        newList.remove(Integer.valueOf(100)); // removes specific element based on value given
        System.out.println(newList);
        newList.add(100);
        newList.add(300);
        System.out.println(newList);
        newList.set(1,200); // updating and existing element
        System.out.println(newList);
        newList.clear(); // removes entire list
        System.out.println(newList);

        System.out.println(list.contains(100)); // checks if element is there in list or not.

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        for (Integer ele : list) {
            System.out.print(ele);
        }
    }
}
