

public class TestCircle
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(5, 0, 0);

        System.out.println("c1: " + c1.getArea() + " " + Math.round(c1.getCircumference() * 100.0) / 100.0);

        
    }
}