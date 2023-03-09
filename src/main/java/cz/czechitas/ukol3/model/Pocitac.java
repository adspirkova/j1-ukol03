package cz.czechitas.ukol3.model;

public class Pocitac {

    private boolean jeZapnuty;
    private Procesor cpu;
    private Pamet ram;
    private Disk pevnyDisk;

    @Override
    public String toString() {
        return "Pocitac{" +
                "jeZapnuty=" + jeZapnuty +
                ", cpu=" + cpu +
                ", ram=" + ram +
                ", pevnyDisk=" + pevnyDisk +
                '}';
    }

    public boolean isJeZapnuty() {
        return jeZapnuty;
    }

    public void zapniPocitac() {
        zkontrolujAbsenciKomponent();
        if (jeZapnuty) {
            System.err.println("Pocitac již běží");
        } else {
            jeZapnuty = true;
            System.out.println("Pocitac je zapnuty");
        }
    }

    public void vypniPocitac() {
        if (jeZapnuty) {
            jeZapnuty = false;
            System.out.println("Pocitac je vypnuty");
        }
        // ignoruj, pokud uz je vypnuty
    }

    public void zkontrolujAbsenciKomponent() {

        if (ram == null) {
            System.err.println("V pocitaci chybi Pamet RAM");
            return;
        }
        if (cpu == null) {
            System.err.println("V pocitaci chybi Procesor CPU");
            return;
        }
        if (pevnyDisk == null) {
            System.err.println("V pocitaci chybi PevnyDisk");
            return;
        }
    }

    public Procesor getCpu() {
        return cpu;
    }

    public void setCpu(Procesor cpu) {
        this.cpu = cpu;
    }

    public Pamet getRam() {
        return ram;
    }

    public void setRam(Pamet ram) {
        this.ram = ram;
    }

    public Disk getPevnyDisk() {
        return pevnyDisk;
    }

    public void setPevnyDisk(Disk pevnyDisk) {
        this.pevnyDisk = pevnyDisk;
    }

    public void vytvorSouborOVelikosti(long velikost) {
        if (jeZapnuty) {
            if (this.pevnyDisk.getVyuziteMisto_B() + velikost > this.pevnyDisk.getKapacitaDisku_B()) {
                System.err.println("Soubor neni mozne pridat z duvodu naplneni kapacity");
            } else {
                this.pevnyDisk.setVyuziteMisto_B(this.pevnyDisk.getVyuziteMisto_B() + velikost);
                System.out.println("Soubor pridan");
            }
        } else {
            System.out.println("Pocitac nebezi");
        }
    }

    public void vymazSouboryOVelikosti(long velikost) {
        if (jeZapnuty) {
            if (this.pevnyDisk.getVyuziteMisto_B() - velikost < 0) {
                System.err.println("Soubor nenalezen");
            } else {
                this.pevnyDisk.setVyuziteMisto_B(this.pevnyDisk.getVyuziteMisto_B() - velikost);
                System.out.println("Soubor smazan");
            }
        } else {
            System.out.println("Pocitac nebezi");
        }

    }
}
