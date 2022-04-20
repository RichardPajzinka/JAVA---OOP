package zive_tvory.stavovce;

import zive_tvory.Tvor;

import java.util.Date;

public class Ryba extends Tvor {
    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {
        System.out.println("plavam lebo som rybka");
    }

    private String meno;
    private double vaha;

    public String getMeno() {
        return meno;
    }

    private void setMeno(String meno) {
        this.meno = meno;
    }

    public double getVaha() {
        return vaha;
    }

    private void setVaha(double vaha) {
        this.vaha = vaha;
    }



    public Ryba() {
        setMeno(meno);
        setVaha(vaha);
    }

    public void nakrmsa(double vaha2){
        setVaha(getVaha()+vaha2);
    }

    @Override
    public void born(Date day_of_birth) {

    }

    @Override
    public void die(Date day_of_death) {

    }
}
