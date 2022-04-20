package zive_tvory.stavovce;

import zive_tvory.Tvor;

import java.util.Date;

public class Zralog extends Tvor {
    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {
    System.out.println("som velky zralog a papam male rybky");
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

    private void setVaha(double vaha) {
        this.vaha = vaha;
    }

    private String meno;
    private double vaha;

    public Zralog() {
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
