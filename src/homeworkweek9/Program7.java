package homeworkweek9;

import java.util.ArrayList;

public class Program7
{
    public static void main(String[] args)
    {
        ArrayList D = new ArrayList();
        D.add("District Line");
        D.add("Piccadilly Line");
        D.add("Jubilee Line");
        D.add("Victoria Line");
        D.add("Circle Line");
        D.add("Hammersmith and City Line");
        D.add("Center Line");


        System.out.println(D);

        if(D.isEmpty())
        {
            System.out.println("The Array List is Empty");
        }
        else
        {
            System.out.println("The Array List is Not Empty");
        }
    }

}
