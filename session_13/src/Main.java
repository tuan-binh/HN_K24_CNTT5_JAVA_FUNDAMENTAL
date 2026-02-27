import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println(numbers);

        ListIterator<Integer> ds = numbers.listIterator();
        while (ds.hasNext()) {
            int n = ds.next();
            if(n == 5) {
                ds.add(10);
            }
            if(n == 3) {
                ds.remove();
            }
        }
        System.out.println(numbers);

    }
}