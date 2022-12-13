public class TP5
{
    public static void main(String[] args)
    {
        String[] tab = {"Désiré ", "Albert", "Christophe", "André", "Bernard"};
        System.out.println(trouverPlusLongNom(tab));

        dessinerLigne(3, 3, 2);
    }

    public static String inverser(String str)
    {
        String inv = "";

        for (int i = str.length() - 1; i >= 0; i--)
            inv += str.charAt(i);

        return inv;
    }

    public static void dessinerLigne (int nm, int nt, int nb)
    {
        for (int i = 0; i < nm; i++)
        {
            for (int j = 0; j < nt; j++)
                System.out.print("_");
            
            for (int k = 0; k < nb; k++)
                System.out.print(" ");
        }
    }

    public static String trouverPlusLongNom(String[] tab)
    {
        int max = 0;
        int poz = -1;

        for (int i = 0; i < tab.length; i++)
            if (tab[i].length() > max)
            {
                max = tab[i].length();
                poz = i;
            }

        return tab[poz];
    }
}