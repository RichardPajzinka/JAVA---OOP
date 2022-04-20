package vesmirnetelesa;

import vesmirnetelesa.Vesmirne_teleso;

public class Kometa extends Vesmirne_teleso {
    public String getMeno() {
        return meno;
    }

    protected void setMeno(String meno) {
        this.meno = meno;
    }

    private String meno;
 private Vesmirne_teleso[] obezne_telesa;

    public Kometa(String strela) {
        setMeno(meno);
    }
}
