public class Rectangle
{
    private int longeur;
    private int largeur;

    public Rectangle()
    {}

    public Rectangle(int longeur, int largeur)
    {
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public int getLongeur()
    {
        return longeur;
    }

    public void setLongeur(int longeur)
    {
        this.longeur = longeur;
    }

    public int getLargeur()
    {
        return largeur;
    }

    public void setLargeur(int largeur)
    {
        this.largeur = largeur;
    }

    public int getPerimetre()
    {
        return 2 * (longeur + largeur);
    }

    public int getAire()
    {
        return longeur * largeur;
    }

    public boolean estCarre()
    {
        return longeur == largeur;
    }

    @Override
    public String toString()
    {
        return "Rectangle de longeur " + longeur + " et de largeur " + largeur;
    }

}