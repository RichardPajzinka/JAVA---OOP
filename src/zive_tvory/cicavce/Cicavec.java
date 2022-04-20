package zive_tvory.cicavce;

import zive_tvory.stavovce.Stavovec;
import zive_tvory.stavovce_diely.sustavy.*;
import zive_tvory.stavovce_diely.sustavy.Nervova.Nervova_sustava_cicavec;

public abstract class Cicavec extends Stavovec implements cicable{

    public void cicat(Cicavec mama){}
    public void cicat(Materske_mlieko mliecko){}


    private int temperature;

    public Cicavec(int pocet_stavcov,  int temperature) {
        super(pocet_stavcov);
        temperature = 36;
    }

    @Override
    public void create_sustavy() {


        sustavas.add(0, new obehova(Typ_sustavy.OBEHOVA));
        sustavas.add(1, new oporna(Typ_sustavy.OPORNA));
        sustavas.add(2, new vylucovacia(Typ_sustavy.VYLUCOVACIA));
        sustavas.add(3, new pohybova(Typ_sustavy.POHYBOVA));
        sustavas.add(4, new dychacia(Typ_sustavy.DYCHACIA));
        sustavas.add(5, new traviacia(Typ_sustavy.TRAVIACA));
        sustavas.add(6, new rozmnozovacia(Typ_sustavy.ROZMNOZOVACIA));
        sustavas.add(7, new Nervova_sustava_cicavec(Typ_sustavy.NERVOVA));

    }

    public Cicavec(int pocet_stavcov) {
        super(pocet_stavcov);
    }
}
