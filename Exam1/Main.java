import java.io.*;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Project p1 = new Project();
        Project p2 = new Project();
        try
        {
            FileInputStream fStream = new FileInputStream("input.txt");

            DataInputStream in = new DataInputStream(fStream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String strLine;

            int i = 0;

            while ((strLine = br.readLine()) != null)
            {
                
                ArrayList<Member> ms = new ArrayList<Member>();
                String[] parts = strLine.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                int hireYear = Integer.parseInt(parts[2]);
                int degree = Integer.parseInt(parts[3]);

                ms.add(new Reseacher(name, age, hireYear, degree));
                
                if (i == 0)
                {
                    p1.setMs(ms);
                    i++;
                }       
                else
                {
                    p2.setMs(ms);
                }         
            }
        }
            catch (Exception e)
            {
                System.err.println("Error: " + e.getMessage());
            }


            System.out.println(p1.getMostExpensiveMember().toString());
            System.out.println(p2.getMostExpensiveMemberHiredThisYear().toString());
        }
    }
