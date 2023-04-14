package TP12;

import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Main {
    //tests for the other classes
    public static void main(String[] args) {
        ArrayList<HardwareProduit> hardwareProduits = new ArrayList<>();
        
        File file1 = new File("./TP12/Moniteurs.txt");
        File file2 = new File("./TP12/CartesVideo.txt");
        Scanner sc1 = new Scanner(file1);
        Scanner sc2 = new Scanner(file2);

        while (sc1.hasNextLine())
        {
            String[] line = sc1.nextLine().split(" ");
            hardwareProduits.add(new Moniteur(Double.parseDouble(line[0]), Double.parseDouble(line[1])));
        }

        while (sc2.hasNextLine())
        {
            String[] line = sc2.nextLine().split(" ");
            hardwareProduits.add(new CarteVideo(Double.parseDouble(line[0]), Double.parseDouble(line[1])));
        }

        for (HardwareProduit hardwareProduit : hardwareProduits)
        {
            hardwareProduit.calculerPrixLei();
            hardwareProduit.calculerPerformance();
            System.out.println(hardwareProduit.toString());
        }


    }
}
