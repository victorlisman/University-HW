import java.util.Scanner;

public class TP4
{
    public static void main(String[] args) 
    {
        TP4 d = new Dev4();

        d.Ex1(2);
        d.Ex2();
        d.Ex3();
        d.Ex4();
    }

    public void Ex1(int nrLunaIarna)
    {
        System.out.println("Ex1: ");

        switch(nrLunaIarna)
        {
            case 12:
                System.out.println("Decembrie");
                break;
            case 1:
                System.out.println("Ianuarie");    
                break;
            case 2:
                System.out.println("Februarie");
                break;

        }
    }

    public void Ex2()
    {
        System.out.println("Ex2: ");

        Scanner sc = new Scanner(System.in);

        int n, pp1 = 1, pp2 = 1, s1 = 0, s2 = 0;

        n = sc.nextInt();

        int a[][] = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        
        sc.close();

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");
            
            System.out.print("\n");
        }

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (i + j < n)
                {
                    pp1 *= a[i][j] % 2 == 0 ? a[i][j] : 1;
                    s1 += a[i][j] >= 0 ? a[i][j] * a[i][j] : 0;

                    if (i <= j)
                    {
                        pp2 *= a[i][j] % 2 == 0 ? a[i][j] : 1;
                        s2 += a[i][j] >= 0 ? a[i][j] * a[i][j] : 0;
                    }
                }

                
        pp1 = pp1 == 1 ? 0 : pp1;
        pp2 = pp2 == 1 ? 0 : pp2;

        System.out.println("Produs numere pare prima zona: " + pp1);
        System.out.println("Suma patrate nr poz prima zona: " + s1);
        System.out.println("Produs numere pare a doua zona: " + pp2);
        System.out.println("Suma patrate nr poz a doua zona: " + s2);
        System.out.println("Matricea transpusa: ");
               
        int c[][] = new int[n][n];
        int a2[][] = new int[n][n];
        int a3[][] = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    a2[i][j] += a[i][k] * a[k][j];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    a3[i][j] += a2[i][k] * a[k][j];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                c[i][j] = a[i][j] + a2[i][j] + a3[i][j];

        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
            {
                int aux = c[i][j];
                c[i][j] = c[j][i];
                c[j][i] = aux;
            }

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print(c[i][j] + " ");
                
            System.out.print("\n");
        }
    }

    public void Ex3()
    {
        System.out.println("Ex3: ");

        int n;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int a[][] = new int[n][n];
        int b[][] = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                b[i][j] = sc.nextInt();
        
        sc.close();

        int p[][] = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    p[i][j] += a[i][k] * b[k][j];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print(p[i][j] + " ");
            
            System.out.print("\n");
        }
    }

    public void Ex4()
    {
        System.out.println("Ex4: ");

        String text;
 
        Scanner sc = new Scanner(System.in);

        text = sc.nextLine();

        sc.close();

        text.trim();
        
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++)
            if (chars[i] >= 'A' && chars[i] <= 'Z')
                chars[i] += 32;

        java.util.Arrays.sort(chars);
        text = new String(chars);

        int cnt = 1;

        for (int i = 1; i < text.length(); i++)
        {
            if (text.charAt(i) == text.charAt(i - 1))
                cnt++;
            else
            {
                if (cnt > 1)
                {
                    boolean isPrime = true;

                    for (int j = 2; j <= cnt / 2; j++)
                        if (cnt % j == 0)
                        {
                            isPrime = false;
                            break;
                        }

                    if (isPrime)
                        System.out.print(text.charAt(i - 1) + " apare de " + cnt + " ori\n");
                }

                cnt = 1;
            }
        }

    }
}