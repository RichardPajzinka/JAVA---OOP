package zive_tvory.stavovce.Vtaky;

import zive_tvory.stavovce.Stavovec;

public abstract class Vtak extends Stavovec {

    public Vtak(int pocet_stavcov){
        super(pocet_stavcov);
    }



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

   // public Vtak() {
   //setMeno(meno);
   //     setVaha(vaha);
   // }

    public void zvysitvyskuletu(double vyska){
        this.vyskaletu = vyskaletu + vyska;
        System.out.println(this.vyskaletu);
    }
}
