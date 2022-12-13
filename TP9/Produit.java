import java.util.GregorianCalendar;

public class Produit
{
    private int code = 0;
    private double prix;
    private GregorianCalendar date = new GregorianCalendar();
    private int perValidite;
    private String categorie;

    //constructeur
    public Produit(double prix, GregorianCalendar date, int perValidite, String categorie)
    {
        this.code++;
        this.prix = prix;
        this.date = date;
        this.perValidite = perValidite;
        this.categorie = categorie;
    }

    //getters and setter
    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public double getPrix()
    {
        return prix;
    }

    public void setPrix(double prix)
    {
        this.prix = prix;
    }

    public GregorianCalendar getDate()
    {
        return date;
    }

    public void setDate(GregorianCalendar date)
    {
        this.date = date;
    }

    public int getPerValidite()
    {
        return perValidite;
    }

    public void setPerValidite(int perValidite)
    {
        this.perValidite = perValidite;
    }

    public String getCategorie()
    {
        return categorie;
    }

    public void setCategorie(String categorie)
    {
        this.categorie = categorie;
    }


}