import java.util.ArrayList;
import java.lang.reflect.Field;

public class ArrayListLength {

    public static void main(String[] args) throws Exception {

        // ArrayList Capacity *****

        ArrayList<Integer> list = new ArrayList<>(12);

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        list.add(11);
        list.add(12);
        list.add(13);

        System.out.println(list);
        // System.out.println(list.size());

        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);

        Object[] elementData = (Object[]) field.get(list);
        System.out.println("ArrayList Capacity : " + elementData.length);

        list.remove(3);
        list.remove(4);
        list.remove(5);
        list.remove(6);
        list.remove(5);
        list.remove(4);
        list.remove(3);

        System.out.println(list);
        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList Capacity After Remove : " + elementData.length);

        list.trimToSize();

        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList Capacity After Trim To Size : " + elementData.length);

    }
}
