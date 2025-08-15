import java.util.*;
public class solution{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(4);

        System.out.println("Before Sorting: " + list);
        Collections.sort(list);
        System.out.println("After Sorting in Acsending Order : " + list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("After Sorting in Desecending Order : " + list);
    }
}