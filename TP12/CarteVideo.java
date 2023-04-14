package TP12;

public class CarteVideo extends HardwareProduit {
    private long monnaie;
    private int maximumNote;


    public CarteVideo(double monnaiePrix, double note) {
        super.setMonnaiePrix(monnaiePrix);
        super.setNote(note);;
    }

    public void calculerPrixLei()
    {
        this.monnaie = (long) (super.getMonnaiePrix() * 4.8);
    }

    public void calculerPerformance()
    {
        super.setPerformance(super.getNote() * 100);
    }

    @Override
    public String toString() {
        return "CarteVideo{" + "monnaie=" + monnaie + ", maximumNote=" + maximumNote + '}';
    }
}
