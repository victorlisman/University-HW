public class TP3
{
    public static void main(String[] args)
    {
        TP3 dev = new TP3();

        dev.E1(1, 2, 1);
        dev.E2();
        dev.E3(47);
        dev.E4(10);
        dev.E5(10);
        dev.E6(10);
    }

    public void E1(int a , int b, int c)
    {
        System.out.println("Ex1: ");

        double delta = b * b - 4 * a * c;

        System.out.print("x1 = " + (-b - Math.sqrt(delta)) / 2 * a + "\n x2 = " + (-b + Math.sqrt(delta)) / 2 * a);
    }

    public void E2()
    {
        System.out.println("\n + Ex2: ");

        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.print("*");

                if (i + j == 9)
                    break;
            }

            System.out.print("\n");
        }

        System.out.println("\n");
        
        for (int i = 0; i < 10; i++)
        {
            for (int j = 0; j < 10; j++)
            {
                System.out.print("*");

                if (j >= i)
                    break;
                
            }

            System.out.print("\n");
        }
    }

    public void E3(int n)
    {
        System.out.println("\n Ex3: ");

        if (n == 0 || n == 1)
            System.out.println("n n'est pas premier");
        else 
        {
            boolean ok = true;

            for (int i = 2; i <= Math.sqrt(n); i++)
                if (n % i == 0)
                    ok = false;

            if (ok == true)
                System.out.println("n est premier");
            else
                System.out.println("n n'est pas premier");

        }
    }

    public void E4(int n)
    {
        System.out.println("\n E4: ");

        int s = 0;

        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= i; j++)
                s += j;

        System.out.println(s);
    }

    public void E5(int n)
    {
        System.out.println("\n E5: ");

        for (int i = 2; i <= n; i++)
        {
            boolean ok = true;

            for (int d = 2; d <= Math.sqrt(i); d++)
                if (i % d == 0)
                    ok = false;

            if (ok == true)
                System.out.println(i);
        }
    }

    public void E6(int n)
    {
        System.out.println("\n E6: ");

        for (int i = 2; i <= n; i++)
        {
            int s = 0;

            for (int d = 1; d < i; d++)
                if (i % d == 0)
                    s += d;
            
            if (s == i)
                System.out.println(i);
        }
    }


}