package vesmirnetelesa.galaxia;


public class Galaxia {
    private int counter;
    private Slnecna_sustava[] planetarne_sustavy = new Slnecna_sustava[100];

    public void addSustava(Slnecna_sustava tato_sustava){
        planetarne_sustavy[counter] =tato_sustava;
        counter++;
    }

    public Galaxia() {
        counter = 0;
    }

    public int getCounter() {
        return counter;
    }

    protected void setCounter(int counter) {
        this.counter = counter;
    }
}
