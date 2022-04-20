package zive_tvory.stavovce;

import zive_tvory.Tvor;

import java.util.Date;

public class Vtak extends Tvor {
    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {
        System.out.println("ja letim");
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

    public double getVyskaletu() {
        return vyskaletu;
    }

    private void setVyskaletu(double vyskaletu) {
        this.vyskaletu = vyskaletu;
    }

    private String meno;
    private double vaha;
    private double vyskaletu;

    public Vtak() {
        setMeno(meno);
        setVaha(vaha);
    }

    public void zvysitvyskuletu(double vyska){
        this.vyskaletu = vyskaletu + vyska;
        System.out.println(this.vyskaletu);
    }

    @Override
    public void born(Date day_of_birth) {

    }

    @Override
    public void die(Date day_of_death) {

    }
}
