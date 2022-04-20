package vesmirnetelesa;

import static java.lang.Math.abs;

public class Hviezda extends Vesmirne_teleso {
    private String meno;
    private double vaha;
    private double priemer;
    private boolean svietim;
    private double temperature;

    public Hviezda(String meno, double vaha, double priemer, double teplota) {
        setMeno(meno);
        setVaha(vaha);
        setPriemer(priemer);
        setTeplota(teplota);
        temperature = 1;
    }

    public Hviezda() {
        setMeno(meno);
        vaha = 1;
        priemer = 1;
        teplota = 100;
        temperature = 1;
    }

    private double teplota;

    public String getMeno() {
        return meno;
    }

    private void setMeno(String meno) {
        this.meno = meno;
    }

    public double getVaha() {
        return vaha;
    }

    public void setVaha(double vaha) {
        if(this.vaha > vaha && abs(this.vaha-vaha)<=1000){
            System.out.println("som chuda hviezda");

        }else if(this.vaha > vaha && abs(this.vaha-vaha)>=1000){
            System.out.println("ja osm prilis chuda hviezda");

        }else if(this.vaha < vaha && abs(this.vaha-vaha)<=1000){
            System.out.println("som velka hviezda");

        }else if(this.vaha < vaha && abs(this.vaha-vaha)>=1000){
            System.out.println("sakra som prilis velka");
        }
        this.vaha=vaha;
    }


    public double getPriemer() {
        return priemer;
    }

    private void setPriemer(double priemer) {
        this.priemer = priemer;
    }

    public double getTeplota() {
        return teplota;
    }

    public void setTeplota(double teplota) {
        while(teplota < vaha){
            teplota++;
        }

        this.teplota = teplota;
        System.out.println("tym že hviezda je vacsia aj jej teplota sa zvysila na " + teplota);
    }

    public void sviet(){
        if(svietim = false){
            svietim = true;
            temperature=teplota;
        }
        System.out.println("teplota ked svieti je na : " + teplota);
    }

    public void zhasni(){
        if(svietim = true){
            svietim = false;
        }

    }
}
