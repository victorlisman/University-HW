import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;

public class Voiture
{
    private int code;
    private String marque;
    private double prix;
    private String pays;
    private GregorianCalendar date;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

    public Voiture(int code, String marque, double prix, String pays, GregorianCalendar date)
    {
        this.code = code;
        this.marque = marque;
        this.prix = prix;
        this.pays = pays;
        this.date = date;
    }


    public Voiture() {
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getPays() {
        return this.pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public GregorianCalendar getDate() {
        return this.date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public Voiture code(int code) {
        setCode(code);
        return this;
    }

    public Voiture marque(String marque) {
        setMarque(marque);
        return this;
    }

    public Voiture prix(double prix) {
        setPrix(prix);
        return this;
    }

    public Voiture pays(String pays) {
        setPays(pays);
        return this;
    }

    public Voiture date(GregorianCalendar date) {
        setDate(date);
        return this;
    }

    @Override
    public String toString() {
        String date = formatter.format(this.date.getTime());
        return "{" +
            " code='" + getCode() + "'" +
            ", marque='" + getMarque() + "'" +
            ", prix='" + getPrix() + "'" +
            ", pays='" + getPays() + "'" +
            ", date='" + date + "'" +
            "}";
    }

}