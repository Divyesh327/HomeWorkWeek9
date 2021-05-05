package homeworkweek9;

import java.util.ArrayList;
import java.util.Iterator;

public class Program5
{
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1001);
        list.add("Divyesh");
        list.add("Software");
        list.add(25.85);
        list.add("39.69");
        list.add("6585");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
