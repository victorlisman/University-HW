public class Personne
{
    private String nom;
    private String prenom;
    private int age;
    private String sexe;

    public Personne(String nom, String prenom)
    {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Personne(String nom, String prenom, int age)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public Personne(String nom, String prenom, int age, String sexe)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.sexe = sexe;
    }

    public String getNom()
    {
        return nom;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getSexe()
    {
        return sexe;
    }

    public void setSexe(String sexe)
    {
        this.sexe = sexe;
    }

    @Override
    public String toString()
    {
        return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", sexe=" + sexe + "]";
    }

}