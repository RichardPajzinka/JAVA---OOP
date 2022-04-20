package zive_tvory.clovecina;

import zive_tvory.stavovce_diely.sustavy.*;
import zive_tvory.stavovce_diely.sustavy.Nervova.Nervova_sustava_cicavec;
import zive_tvory.stavovce_diely.sustavy.RozmnozovaciaClovek.Rozmnozovacia_sustava_Muz;

public class Muz extends Clovek{
    public Muz(int pocet_stavcov, int temperature) {
        super(pocet_stavcov, temperature);
    }

    public Muz(Clovek otec, Clovek mama,int pocet_stavcov) {
        super(otec,mama,pocet_stavcov);
    }


    public Muz(Clovek otec,Clovek mama,int pocet_stavcov,String name,String surname){
        super(otec,mama,pocet_stavcov);

        super.name = name;
        super.surname=surname;

        create_sustavy();
    }


    @Override
    public void create_sustavy() {
           // sustavas = new Sustava[8];

            sustavas.add(0, new obehova(Typ_sustavy.OBEHOVA));
            sustavas.add(1, new oporna(Typ_sustavy.OPORNA));
            sustavas.add(2, new vylucovacia(Typ_sustavy.VYLUCOVACIA));
            sustavas.add(3, new pohybova(Typ_sustavy.POHYBOVA));
            sustavas.add(4, new dychacia(Typ_sustavy.DYCHACIA));
            sustavas.add(5, new traviacia(Typ_sustavy.TRAVIACA));
            sustavas.add(6, new Rozmnozovacia_sustava_Muz(Typ_sustavy.ROZMNOZOVACIA));
            sustavas.add(7, new Nervova_sustava_cicavec(Typ_sustavy.NERVOVA));

            System.out.println("som chlap a toto je moja rozmnozovacia sustava");
        }

    }

