import java.time.LocalDate;

public class Produit
{
    public int code = 0;
    private double prix;
    private LocalDate date;
    private int perValidite;
    private String categorie;

    public Produit(int code, double prix, LocalDate date, int perValidite, String categorie)
    {
        this.code = code;
        this.prix = prix;
        this.date = date;
        this.perValidite = perValidite;
        this.categorie = categorie;
    }

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

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
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

    @Override
    public String toString()
    {
        return "Produit [code=" + code + ", prix=" + prix + ", date=" + date + ", perValidite=" + perValidite
                + ", categorie=" + categorie + "]";
    }

}