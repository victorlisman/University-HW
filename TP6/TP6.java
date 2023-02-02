import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class TP6
{
    public static void main(String[] args)
    {
        System.out.println(E1("aabcada", 'a'));

        E2();

    }


    public static int E1(String a, char x)
    {
        if (a.length() == 0)
            return 0;

        if (a.charAt(a.length() - 1) == x)
            return E1(a.substring(0, a.length() - 1), x) + 1;
        else
            return E1(a.substring(0, a.length() - 1), x);
    }

    public static void E2()
    {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> a = new ArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            Integer x = sc.nextInt();
            a.add(x);
        }

        Collections.sort(a);

        for (int i = 0; i < a.size() - 1; i++)
            if (a.get(i) == a.get(i + 1))
            {
                a.remove(i);
                i--;
            }

        for (Integer x : a)
            System.out.print(x + " ");

        sc.close();
    }
}