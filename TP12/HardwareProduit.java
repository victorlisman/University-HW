package TP12;

public class HardwareProduit {
    private double monnaiePrix;
    private double leiPrix;
    private double note;
    private double performance;
    
    public void calculerPerformance() {
        // TODO
    }

    public double calculerRapportLeiPrixPerformance() {
        // TODO
        return 0;
    }
    
    public void calculerPrixLei()
    {

    }
    
    //setters
    public void setMonnaiePrix(double monnaiePrix) {
        this.monnaiePrix = monnaiePrix;
    }

    public void setLeiPrix(double leiPrix) {
        this.leiPrix = leiPrix;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }

    //getters
    public double getMonnaiePrix() {
        return monnaiePrix;
    }

    public double getLeiPrix() {
        return leiPrix;
    }

    public double getNote() {
        return note;
    }

    public double getPerformance() {
        return performance;
    }



    @Override
    public String toString() {
        return "HardwareProduit{" + "monnaiePrix=" + monnaiePrix + ", leiPrix=" + leiPrix + ", note=" + note + ", performance=" + performance + '}';
    }
}
