package vesmirnetelesa;

import static java.lang.Math.abs;

public class Planeta extends Vesmirne_teleso{
    private String meno;
    private double vaha;
    private double priemer;
    private double gravitacia;



    private Boolean weightSet=false;


    public Planeta(String meno, double vaha, double priemer) {
        setMeno(meno);
        setVaha(vaha);
        setPriemer(priemer);
        gravitacia = 9.81;
        weightSet = false;
    }

    public Planeta() {
        meno = "nemenovana";
        vaha = 0;
        priemer = 0;
        setGravitacia(9.81);
        weightSet = false;
    }

    public Planeta(String meno, double vaha, double gravitacia, Boolean weightSet) {
        setMeno(meno);
        setVaha(vaha);
        setGravitacia(gravitacia);
        setWeightSet(false);
    }

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
            System.out.println("ja chudnem " + meno);
            decreaseGravity(0.1);
        }else if(this.vaha > vaha && abs(this.vaha-vaha)>=1000){
            System.out.println("ja chudnem velmni " + meno);
            increaseGravity(0.1);

        }else if(this.vaha < vaha && abs(this.vaha-vaha)<=1000){
            decreaseGravity(0.1);
            System.out.println("dokelu,pribrala som " + meno);
            //increaseGravity(0.1);
        }else if(this.vaha < vaha && abs(this.vaha-vaha)>=1000){
            System.out.println("sakra, moc som pribrala " + meno);
            increaseGravity(0.1);


        }
        this.vaha=vaha;

    }


    public Boolean getWeightSet() {
        return weightSet;
    }

    public void setWeightSet(Boolean weightSet) {
        this.weightSet = weightSet;
    }

    public double getPriemer() {
        return priemer;
    }

    private void setPriemer(double priemer) {
        this.priemer = priemer;
    }

    public double getGravitacia() {
        return gravitacia;
    }

    private void setGravitacia(double gravitacia) {
        this.gravitacia = gravitacia;
    }

    public void increaseGravity(double add){
        gravitacia=gravitacia+add;

    }

    public void decreaseGravity(double dec){
        gravitacia=gravitacia-dec;

    }

    public void setPlanetaryWeight(double vaha){
        if(weightSet == false){
            setVaha(vaha);
            weightSet=true;
            System.out.println("moja hmotnost je " + this.vaha);
            System.out.println("moja gravitacia je " + gravitacia);
        }
    }



}
