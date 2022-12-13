import java.util.ArrayList;

public class TestPersonne 
{
    public static void main(String[] args) 
    {
        Personne p1 = new Personne("Doe", "John", 25, "M");
        Personne p2 = new Personne("Doe", "Jane", 22, "F");
        Personne p3 = new Personne("Doe", "Jack", 20, "M");
        Personne p4 = new Personne("Doe", "Jill");
        p4.setAge(35);
        p4.setSexe("F");


        ArrayList<Personne> personnes = new ArrayList<Personne>();

        personnes.add(p1);
        personnes.add(p2);
        personnes.add(p3);
        personnes.add(p4);

        Personne pers = new Personne("null", "null", 0, "F");

        for (Personne p : personnes)
            if (p.getSexe().equals("F") && p.getAge() > pers.getAge())
                pers = p;


        System.out.println(pers.toString());
    }
    
}
