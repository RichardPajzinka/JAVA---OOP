package vesmirnetelesa.galaxia;

import vesmirnetelesa.Hviezda;
import vesmirnetelesa.Kometa;
import vesmirnetelesa.Planeta;
import vesmirnetelesa.Vesmirne_teleso;

import java.util.LinkedList;
import java.util.List;

public class Slnecna_sustava{
    private int object_counter;
    private Hviezda Slnko;

    public int getObject_counter() {
        return object_counter;
    }


    protected void setObject_counter(int object_counter) {
        this.object_counter = object_counter;
    }



    //konstruktor
    public Slnecna_sustava() {
        Slnko = new Hviezda();

        setObject_counter(0);

        obezne_telesa.add(object_counter, new Planeta("Merkur", 3000000, 112522));
        object_counter++;

        obezne_telesa.add(object_counter, new Planeta("Venusa", 5000000, 12745));
        object_counter++;

        obezne_telesa.add(object_counter, new Planeta("Zem", 3000000, 12756));
        object_counter++;

        obezne_telesa.add(object_counter, new Planeta("Jupiter", 9000000, 124841));
        object_counter++;

        obezne_telesa.add(object_counter, new Planeta("Saturn", 5400000, 424512));
        object_counter++;

        obezne_telesa.add(object_counter, new Planeta("Uran", 9000000, 324515));
        object_counter++;

        obezne_telesa.add(object_counter, new Planeta("Neptun", 5000000, 9271451));
        object_counter++;

        obezne_telesa.add(object_counter, new Planeta("Pluto", 1000000, 52656));
        object_counter++;

        obezne_telesa.add(object_counter, new Hviezda("Polarka", 102, 5000, 100));
        object_counter++;

        obezne_telesa.add(object_counter, new Kometa("strela"));
        object_counter++;
    }

   // private Vesmirne_teleso[] obezne_telesa = new Vesmirne_teleso[100];
    private List<Vesmirne_teleso> obezne_telesa=new LinkedList<>();

    public void addTeleso(Vesmirne_teleso nove_teleso){
        obezne_telesa.add(object_counter, nove_teleso);
        object_counter++;
    }


}
