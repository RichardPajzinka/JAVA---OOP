package auta;

public class UniverseCarFactory {
    protected String nazovfabriky;

    public UniverseCarFactory(String nazovfabriky) {
        this.nazovfabriky = nazovfabriky;
    }

    public Auto produce(String type) {
        if (type == "SUV") {
            Auto suvko = new SUV();
            suvko.setZnacka(nazovfabriky);
            suvko.setModel("Suviaq");
            return suvko;
        } else if (type == "MPV") {
            Auto mpvcko = new MPV();
            mpvcko.setZnacka(nazovfabriky);
            mpvcko.setModel("Familiaq");
            return mpvcko;
        } else if (type == "Mini_auta") {
            Auto mini_auta = new Mini_auta();
            mini_auta.setZnacka(nazovfabriky);
            mini_auta.setModel("Mini_auto");
            return mini_auta;
        } else {
            Auto sportove_auta = new Sportove_auta();
            sportove_auta.setModel("sportove_auta");
            sportove_auta.setZnacka(nazovfabriky);
            return sportove_auta;
        }

    }
}
