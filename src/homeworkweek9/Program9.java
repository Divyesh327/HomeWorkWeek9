package homeworkweek9;

import java.util.HashMap;
import java.util.Map;

public class Program9
{
    public static void main(String[] args)
    {
        Map<Integer,String > People = new HashMap<>();

        People.put(1,"ABC");
        People.put(2,"XYZ");
        People.put(3,"PQR");
        People.put(4,"EFG");
        People.put(5,"UVW");
        People.put(6,"LMN");

        People.forEach((key, value) -> System.out.println(key + " = " + value));
            
    }

}
