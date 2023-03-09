package cz.czechitas.ukol3;

import cz.czechitas.ukol3.model.Disk;
import cz.czechitas.ukol3.model.Pamet;
import cz.czechitas.ukol3.model.Pocitac;
import cz.czechitas.ukol3.model.Procesor;

/**
 * Spouštěcí třída celého programu
 */
public class HlavniProgram {

    public static void main(String... args) {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");
//        prvotniNastaveni();
        pridaniASmazaniSouboru();
    }

    public static void prvotniNastaveni() {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pocitac adelyPocitac;
        adelyPocitac = new Pocitac();
        System.out.println(adelyPocitac);
        adelyPocitac.zapniPocitac();      // Vypise chybu, protoze pocitac
        // nema vsechny povinne soucasti

        Procesor adelyProcesor = new Procesor();
        adelyProcesor.setRychlost_Hz(3_400_000_000_000L);
        adelyProcesor.setVyrobce("Intel");

        Pamet adelyPamet = new Pamet();
        adelyPamet.setKapacitaPameti_B(16_000_000_000L);

        Disk adelyDisk = new Disk();
        adelyDisk.setKapacitaDisku_B(255_195_746_304L);

        adelyPocitac.setCpu(adelyProcesor);
        adelyPocitac.setRam(adelyPamet);
        adelyPocitac.setPevnyDisk(adelyDisk);

        System.out.println(adelyPocitac);

        adelyPocitac.zapniPocitac();
        adelyPocitac.zapniPocitac();      // Vypise chybu, protoze pocitac uz bezi
        System.out.println(adelyPocitac);
        adelyPocitac.vypniPocitac();

        adelyPocitac.vypniPocitac();      // Nevypise chybu, ale nic neprovede,
        adelyPocitac.vypniPocitac();
    }

    public static void pridaniASmazaniSouboru() {
        //TODO tady bude váš kód - vytvoření instance třídy Pocitac, zapnutí, vpynutí, výpis hodnot.
        System.out.println("Program spuštěn.");

        Pocitac adelyPocitac;
        adelyPocitac = new Pocitac();

        Procesor adelyProcesor = new Procesor();
        adelyProcesor.setRychlost_Hz(3_400_000_000_000L);
        adelyProcesor.setVyrobce("Intel");

        Pamet adelyPamet = new Pamet();
        adelyPamet.setKapacitaPameti_B(16_000_000_000L);

        Disk adelyDisk = new Disk();
        adelyDisk.setKapacitaDisku_B(255_195_746_304L);

        adelyPocitac.setCpu(adelyProcesor);
        adelyPocitac.setRam(adelyPamet);
        adelyPocitac.setPevnyDisk(adelyDisk);

        adelyPocitac.zapniPocitac();
        System.out.println(adelyPocitac);

        adelyPocitac.vytvorSouborOVelikosti(255_195_746_304L); // Soubor se vejde na disk
        adelyPocitac.vytvorSouborOVelikosti(255_195_746_305L);// Soubor se nevejde na disk
        adelyPocitac.vymazSouboryOVelikosti(255_195_746_305L);// Soubor neexistuje
        adelyPocitac.vymazSouboryOVelikosti(255_195_746_304L);// Soubor smazan
        System.out.println(adelyPocitac);
    }

}
