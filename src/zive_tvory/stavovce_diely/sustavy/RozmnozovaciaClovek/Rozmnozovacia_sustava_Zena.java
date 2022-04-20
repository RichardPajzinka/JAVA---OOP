package zive_tvory.stavovce_diely.sustavy.RozmnozovaciaClovek;

import zive_tvory.clovecina.Clovek;
import zive_tvory.stavovce_diely.sustavy.Typ_sustavy;
import zive_tvory.stavovce_diely.sustavy.rozmnozovacia;

public class Rozmnozovacia_sustava_Zena extends rozmnozovacia {

    private int BabyDevelopmentProgress=0;

    public Rozmnozovacia_sustava_Zena(Typ_sustavy typSustavy) {
        super(typSustavy);
    }

    public int takeAndCareBaby(Clovek plod){
        while (BabyDevelopmentProgress!=100){
            BabyDevelopmentProgress++;
        }
        plod.create_sustavy();
        return BabyDevelopmentProgress;
    }
}
