//Functii adaugate pentru eficienta exercitiilor(citire matrice, afisare matrice, inmultire, transpusa)
import java.util.Scanner;

public class TP4mod
{
    public static void main(String[] args) 
    {
        TP4mod d = new Dev4();

        //d.Ex1(2);
        //d.Ex2();
        d.Ex3();
        //d.Ex4();
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

        readMatrix(a, n, n);
        
        sc.close();

        printMatrix(a, n, n);

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

        a2 = multiplyMatrix(a, a, n, n);

        a3 = multiplyMatrix(a2, a, n, n);

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                c[i][j] = a[i][j] + a2[i][j] + a3[i][j];


        c = transposeMatrix(c, n, n);

        printMatrix(c, n, n);
    }

    public void Ex3()
    {
        System.out.println("Ex3: ");

        int n;

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();

        int a[][] = new int[n][n];
        int b[][] = new int[n][n];

        readMatrix(a, n, n);
        readMatrix(b, n, n);
        
        sc.close();

        int p[][] = new int[n][n];

        p = multiplyMatrix(a, b, n, n);

        printMatrix(p, n, n);
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

    public static void printMatrix(int a[][], int n, int m)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
                System.out.print(a[i][j] + " ");
            
            System.out.print("\n");
        }
    }

    public static void readMatrix(int a[][], int n, int m)
    {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = sc.nextInt();

    }

    public static int[][] multiplyMatrix(int a[][], int b[][], int n, int m)
    {
        int p[][] = new int[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                for (int k = 0; k < n; k++)
                    p[i][j] += a[i][k] * b[k][j];

        return p;
    }

    public static int[][] transposeMatrix(int a[][], int n, int m)
    {
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
            {
                int aux = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = aux;
            }

        return a;
    }
}