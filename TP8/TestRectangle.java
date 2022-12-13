public class TestRectangle 
{
    public static void main(String[] args)
    {

    Rectangle r1 = new Rectangle(5, 5);
    Rectangle r2 = new Rectangle();

    r2.setLongeur(10);
    r2.setLargeur(15);

    System.out.println(r1.getPerimetre());
    System.out.println(r2.getAire());

    if (r1.estCarre())
        System.out.println(r1.getLargeur() + r1.getLongeur());
    else
        System.out.println("r1 n'est pas un carré");

    System.out.println(r2.toString());
    }

}