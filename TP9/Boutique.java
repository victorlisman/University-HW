import java.util.ArrayList;
import java.util.Calendar;

public class Boutique 
{
    ArrayList<Produit> produits = new ArrayList<Produit>();

    void ajouterProduit(Produit p)
    {
        produits.add(p);
    }

    void effacerProduit(Produit p)
    {
        for (Produit i : produits)
            if (i.getCode() == p.getCode())
            {
                produits.remove(i);
                break;
            }
    }

    void modifierPrix(Produit p, double prix)
    {
        for (Produit i : produits)
            if (i.getCode() == p.getCode())
            {
                i.setPrix(prix);
                break;
            }
    }

    void afficherProduits(String categorie)
    {
        for (Produit i : produits)
            if (i.getCategorie().equals(categorie))
                System.out.println(i);
    }

    void produitPerimes()
    {
        for (Produit i : produits)
            if (i.getPerValidite() + i.getDate().get(Calendar.YEAR) > Calendar.getInstance().get(Calendar.YEAR))
                System.out.println(i);
    }

    void produitMoinsCher()
    {
        Produit p = produits.get(0);
        for (Produit i : produits)
            if (i.getPrix() < p.getPrix())
                p = i;
        System.out.println(p);
    }

    double prixMoyen()
    {
        double prix = 0;
        int nb = 0;
        for (Produit i : produits)
            if (i.getDate().get(Calendar.YEAR) > Calendar.getInstance().get(Calendar.YEAR) - 3)
            {
                prix += i.getPrix();
                nb++;
            }
        return prix / nb;
    }

}
