package calculate;

public class Calculator {


    public void addition(int a, int b)
    {
        int add;
        add = a + b;
        System.out.println("The Addition is: " + add);
    }

    public void subtraction(int a, int b)
    {
        int sub;
        sub = a - b;
        System.out.println("The Subtraction is:" + sub);
    }

    public void multiplication(int a, int b)
    {
        int mul;
        mul = a * b;
        System.out.println("The Multiplication is: " + mul);
    }

    public void division(int a, int b)
    {
        double div;
        div = a / b;
        System.out.println("The Division is " + div);
    }

    public void calculateResult(int a, int b, char Symbol)
    {

        if (Symbol == '+')
        {
            addition(a, b);
        }
        else if (Symbol == '-')
        {
            subtraction(a, b);
        }
        else if (Symbol == '*')
        {
            multiplication(a, b);
        }
        else
        {
            division(a, b);
        }

    }

}
