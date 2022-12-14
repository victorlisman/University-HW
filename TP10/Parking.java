import java.util.ArrayList;

public class Parking
{
    ArrayList<Voiture> voitures;

    public Parking()
    {
        voitures = new ArrayList<Voiture>();
    }

    public boolean ajouterVoiture(Voiture v)
    {
        if (voitures.contains(v))
        {
            return false;
        }
        else
        {
            voitures.add(v);
            return true;
        }
    }

    public boolean retinerVoiture(int index)
    {
        if (index < 0 || index >= voitures.size())
        {
            return false;
        }
        else
        {
            voitures.remove(index);
            return true;
        }
    }

    public boolean modifierPaysProduction(int code)
    {
        for (int i = 0; i < voitures.size(); i++)
        {
            if (voitures.get(i).getCode() == code)
            {
                voitures.get(i).setPays("France");
                return true;
            }
        }
        return false;
    }

    public void afficerParMarque()
    {
        for (Voiture i : voitures)
            System.out.println(i.getMarque());
    }

    public void afficerParPays()
    {
        for (Voiture i : voitures)
            System.out.println(i.getPays());
    }

    public void trouverVoituresFabriqueesDeuxDernieresAnnees()
    {
        for (Voiture i : voitures)
        {
            if (i.getDate().get(i.getDate().YEAR) >= 2018)
            {
                System.out.println(i.toString());
            }
        }
    }

    public Voiture plusChereVoiture()
    {
        Voiture v = voitures.get(0);
        for (int i = 1; i < voitures.size(); i++)
        {
            if (voitures.get(i).getPrix() > v.getPrix())
            {
                v = voitures.get(i);
            }
        }
        return v;
    }

    public double prixMoyen(String marque)
    {
        double prix = 0;
        int nb = 0;
        for (Voiture i : voitures)
        {
            if (i.getMarque().equals(marque))
            {
                prix += i.getPrix();
                nb++;
            }
        }
        return prix / nb;
    }


}