//exercitiul 1 + 2

public class Media
{
    public static void main(String[] args)
    {
        double a, b, c;
        a = 2.2f;
        b = 3.3f;
        c = 10f;

        double d = (a + b + c) / 3;

        System.out.println(d);

        d = Math.round(d * 100.0) / 100.0;

        System.out.println(d);


    }
}