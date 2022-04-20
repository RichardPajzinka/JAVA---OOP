package zive_tvory.stavovce_diely.sustavy;

public abstract class Sustava {
    Typ_sustavy typSustavy;

    public Sustava(Typ_sustavy typSustavy) {
        this.typSustavy = typSustavy;
    }

    public Typ_sustavy getTypSustavy() {
        return typSustavy;
    }
}
