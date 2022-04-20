package vesmirnetelesa;
import zive_tvory.Tvor;

import java.util.ArrayList;
import java.util.List;

public class Zem extends Planeta{
    private Tvor[] poleTvorov;
    private int pocet_tvorov;



    public Zem(String meno, double vaha, double priemer) {
        super(meno, vaha, priemer);

        poleTvorov= new Tvor[500];
        pocet_tvorov=0;
    }

    public void addTvora(Tvor tentotvor){
        poleTvorov[pocet_tvorov]=tentotvor;
        pocet_tvorov++;
    }

    public void delTvora(Tvor tentotvor){
        for(int i = 0; i < poleTvorov.length; i++){
            if(poleTvorov[i] == tentotvor){
                poleTvorov[i] = null;
            }
        }
    }

    public int getPocet_tvorov() {
        return pocet_tvorov;
    }

    public Tvor[] getPoleTvorov() {

        return poleTvorov;
    }

    public String[] getMenaTvorov(){
        List<String> temp = new ArrayList();
        for(Tvor t:getPoleTvorov()){
            temp.add(t.getClass().getName());

        }
        String[] nazov = temp.toArray(new String[0]);
        return nazov;
    }
}


