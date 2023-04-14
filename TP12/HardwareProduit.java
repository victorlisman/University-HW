package TP12;

abstract public class HardwareProduit {
    private double monnaiePrix;
    private double leiPrix;
    private double note;
    private double performance;
    
    abstract public void calculerPerformance();

    public double calculerRapportLeiPrixPerformance() {
        return this.leiPrix / this.performance;
    }
    
    abstract public void calculerPrixLei();
    
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
