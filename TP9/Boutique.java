import java.time.LocalDate;
import java.util.ArrayList;

public class Boutique 
{
    private ArrayList<Produit> produits = new ArrayList<Produit>();

    public void ajouterProduit(Produit p)
    {
        produits.add(p);
    }

    public void effacerProduit(int index)
    {
        for (Produit i : produits)
            if (produits.indexOf(i) == index)
            {
                produits.remove(i);
                break;
            }
    }

    public void modifierPrix(Produit p, double prix)
    {
        for (Produit i : produits)
            if (i.getCode() == p.getCode())
            {
                i.setPrix(prix);
                break;
            }
    }

    public void afficherProduits(String categorie)
    {
        for (Produit i : produits)
            if (i.getCategorie().equals(categorie))
                System.out.println(i.toString());
    }

    public void produitPerimes()
    {
        for (Produit i : produits)
            if (i.getDate().getYear() + i.getPerValidite() < LocalDate.now().getYear())
                System.out.println(i.toString());
    }

    public void produitMoinsCher()
    {
        Produit p = produits.get(0);
        for (Produit i : produits)
            if (i.getPrix() < p.getPrix())
                p = i;
        System.out.println(p.toString());
    }

    public double prixMoyen()
    {
        double prix = 0;
        int nb = 0;
        for (Produit i : produits)
            if (i.getDate().isAfter(LocalDate.of(2019, 1, 1)))
            {
                prix += i.getPrix();
                nb++;
            }

        return prix / nb;
    }

}
