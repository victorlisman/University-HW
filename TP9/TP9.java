import java.time.LocalDate;


public class TP9
{
    public static void main(String[] args)
    {
        Boutique b1 = new Boutique();
        Boutique b2 = new Boutique();

        b1.ajouterProduit(new Produit(0, 10, LocalDate.of(2015, 1, 1), 1, "categorie1"));
        b1.ajouterProduit(new Produit(1, 12, LocalDate.of(2016, 1, 3), 3, "categorie1"));
        b1.ajouterProduit(new Produit(2, 10, LocalDate.of(2012, 1, 1), 4, "categorie3"));
        b1.ajouterProduit(new Produit(3, 15, LocalDate.of(2022, 1, 3), 5, "categorie2"));
        b1.ajouterProduit(new Produit(4, 13, LocalDate.of(2020, 1, 1), 4, "categorie1"));
        b1.ajouterProduit(new Produit(5, 17, LocalDate.of(2019, 1, 3), 3, "categorie2"));

        b1.effacerProduit(1);
        
        Produit p = new Produit(0, 14, null, 0, null);

        b1.modifierPrix(p, p.getPrix());
        System.out.println("Produits de la categorie 1:");
        b1.afficherProduits("categorie1");

        System.out.println("Produits perimes:");
        b1.produitPerimes();

        System.out.println("Produit le moins cher:");
        b1.produitMoinsCher();

        System.out.println("Prix moyen:");
        System.out.println(b1.prixMoyen());


    }
}