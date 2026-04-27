import java.util.Iterator;
import java.util.LinkedHashSet;
public class HashsetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("raj");
        set.add("veer");
        set.add("naman");
        set.add("adi");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println(set);
    }
}