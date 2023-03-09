package cz.czechitas.ukol3.model;

public class Disk {
    private long kapacitaDisku_B;
    private long vyuziteMisto_B;

    @Override
    public String toString() {
        return "Disk{" +
                "kapacitaDisku_B=" + kapacitaDisku_B +
                ", vyuziteMisto_B=" + vyuziteMisto_B +
                '}';
    }

    public long getKapacitaDisku_B() {
        return kapacitaDisku_B;
    }

    public void setKapacitaDisku_B(long kapacitaDisku_B) {
        this.kapacitaDisku_B = kapacitaDisku_B;
    }

    public long getVyuziteMisto_B() {
        return vyuziteMisto_B;
    }

    public void setVyuziteMisto_B(long vyuziteMisto_B) {
        this.vyuziteMisto_B = vyuziteMisto_B;
    }
}
