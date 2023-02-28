import java.util.ArrayList;
import java.util.List;

public class JoinArrayLists {
    public static void main(String[] args) {
        // Creamos la primera lista de arrays
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Creamos la segunda lista de arrays
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Unimos las arrays
        List<Integer> joinedList = new ArrayList<>();
        joinedList.addAll(list1);
        joinedList.addAll(list2);

        // Printeamos la union
        System.out.println(joinedList);
    }
}
