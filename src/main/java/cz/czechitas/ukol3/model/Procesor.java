package cz.czechitas.ukol3.model;

public class Procesor {
    private String vyrobce;
    private long rychlost_Hz;

    @Override
    public String toString() {
        return "Procesor{" +
                "vyrobce='" + vyrobce + '\'' +
                ", rychlost_Hz=" + rychlost_Hz +
                '}';
    }

    public String getVyrobce() {
        return vyrobce;
    }

    public void setVyrobce(String vyrobce) {
        this.vyrobce = vyrobce;
    }

    public long getRychlost_Hz() {
        return rychlost_Hz;
    }

    public void setRychlost_Hz(long rychlost_Hz) {
        this.rychlost_Hz = rychlost_Hz;
    }
}
