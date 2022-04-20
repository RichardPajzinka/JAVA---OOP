package zive_tvory.stavovce.Ryby;

import zive_tvory.stavovce.Stavovec;

public abstract class Ryba extends Stavovec {

    public Ryba(int pocet_stavcov){
        super(pocet_stavcov);
    }

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




    public void nakrmsa(double vaha2){
        setVaha(getVaha()+vaha2);
    }
}
