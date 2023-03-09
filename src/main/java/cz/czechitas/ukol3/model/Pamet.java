package cz.czechitas.ukol3.model;

public class Pamet {

    private long kapacitaPameti_B;

    @Override
    public String toString() {
        return "Pamet{" +
                "kapacitaPameti_B=" + kapacitaPameti_B +
                '}';
    }

    public long getKapacitaPameti_B() {
        return kapacitaPameti_B;
    }

    public void setKapacitaPameti_B(long kapacitaPameti_B) {
        this.kapacitaPameti_B = kapacitaPameti_B;
    }
}
