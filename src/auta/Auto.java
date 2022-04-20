package auta;

public abstract class Auto {
    protected String znacka;
    protected String model;

    public String getZnacka() {
        return znacka;
    }

    public void setZnacka(String znacka) {
        this.znacka = znacka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String toString(){
        System.out.println("značka" + znacka + "model" + model);
        return null;
    }
}
