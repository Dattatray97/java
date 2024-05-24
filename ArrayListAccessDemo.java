import java.util.ArrayList;

public class ArrayListAccessDemo 
{
    public static void main(String[] args) 
{
  
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        String firstElement = arrayList.get(0);
        String lastElement = arrayList.get(arrayList.size() - 1);

        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);

        int size = arrayList.size();
        System.out.println("Size of ArrayList: " + size);

        boolean isEmpty = arrayList.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);
    }
}
