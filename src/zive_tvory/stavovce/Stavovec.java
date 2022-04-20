package zive_tvory.stavovce;

import zive_tvory.Tvor;
import zive_tvory.stavovce_diely.Chrbtica;
import zive_tvory.stavovce_diely.sustavy.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public abstract class Stavovec extends Tvor {

    protected Chrbtica chrbtica;
   //protected Sustava[] sustavas;
    protected List<Sustava> sustavas=new LinkedList<>();


    public Stavovec(int pocet_stavcov) {
        chrbtica = new Chrbtica(pocet_stavcov);
      //  create_sustavy();

    }



    protected void create_sustavy(){
      //  sustavas = new Sustava[8];

        sustavas.add(0, new obehova(Typ_sustavy.OBEHOVA));
        sustavas.add(1, new oporna(Typ_sustavy.OPORNA));
        sustavas.add(2, new vylucovacia(Typ_sustavy.VYLUCOVACIA));
        sustavas.add(3, new pohybova(Typ_sustavy.POHYBOVA));
        sustavas.add(4, new dychacia(Typ_sustavy.DYCHACIA));
        sustavas.add(5, new traviacia(Typ_sustavy.TRAVIACA));
        sustavas.add(6, new rozmnozovacia(Typ_sustavy.ROZMNOZOVACIA));
        sustavas.add(7, new Nervova_sustava_stavovec_default(Typ_sustavy.NERVOVA));
        }


   // public Sustava[] getSustavas() {
    //    return sustavas;
   // }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {

    }

    @Override
    public void born(Date day_of_birth) {

    }

    @Override
    public void die(Date day_of_death) {

    }


}
