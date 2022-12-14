import java.util.GregorianCalendar;

public class Main
{
    public static void main(String[] args)
    {
        Parking p = new Parking();
        p.ajouterVoiture(new Voiture(1, "Peugeot", 10000, "France", new GregorianCalendar(2019, 1, 1)));
        p.ajouterVoiture(new Voiture(2, "Peugeot", 20000, "Allemagne", new GregorianCalendar(2016, 1, 1)));
        p.ajouterVoiture(new Voiture(3, "Peugeot", 30000, "Italie", new GregorianCalendar(2015, 1, 1)));
        p.ajouterVoiture(new Voiture(4, "Peugeot", 40000, "France", new GregorianCalendar(2013, 1, 1)));
        p.ajouterVoiture(new Voiture(5, "Peugeot", 50000, "Allemagne", new GregorianCalendar(2020, 1, 1)));
        p.ajouterVoiture(new Voiture(6, "Renault", 60000, "France", new GregorianCalendar(2022, 1, 1)));
        p.ajouterVoiture(new Voiture(7, "Renault", 70000, "Allemagne", new GregorianCalendar(2014, 1, 1)));
        p.ajouterVoiture(new Voiture(8, "Renault", 80000, "Italie", new GregorianCalendar(2019, 1, 1)));

        p.retinerVoiture(0);
        p.modifierPaysProduction(2);
        p.afficerParMarque();
        p.afficerParPays();
        p.trouverVoituresFabriqueesDeuxDernieresAnnees();
        System.out.println(p.plusChereVoiture().toString());
        System.out.println(p.prixMoyen("Peugeot"));
    }
}