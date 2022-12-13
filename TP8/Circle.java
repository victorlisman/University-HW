public class Circle
{
    private int rayon;
    private int x;
    private int y;
    private double pi;

    public Circle(int rayon, int x, int y)
    {
        this.rayon = rayon;
        this.x = x;
        this.y = y;
        this.pi = 3.14;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public void setRayon(int rayon)
    {
        this.rayon = rayon;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int getRayon()
    {
        return rayon;
    }

    public double getArea()
    {
        return pi * rayon * rayon;
    }

    public double getCircumference()
    {
        return 2 * pi * rayon;
    }

}