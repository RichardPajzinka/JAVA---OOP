package zive_tvory.clovecina;

import zive_tvory.stavovce_diely.sustavy.*;
import zive_tvory.stavovce_diely.sustavy.Nervova.Nervova_sustava_cicavec;
import zive_tvory.stavovce_diely.sustavy.RozmnozovaciaClovek.Rozmnozovacia_sustava_Zena;

import java.util.Random;

public class Zena extends Clovek{
    public Zena(int pocet_stavcov, int temperature) {
        super(pocet_stavcov, temperature);
    }

    public Zena(Clovek otec, Clovek mama,int pocet_stavcov) {
        super(otec,mama,pocet_stavcov);
    }

    public Zena(Clovek otec,Clovek mama,int pocet_stavcov,String name,String surname){
        super(otec,mama,pocet_stavcov);

        super.name = name;
        super.surname=surname;

        create_sustavy();
    }



    public Clovek splodit(Muz stymtomuzom){
        Random rand = new Random();
        Boolean man = rand.nextBoolean();

        Clovek cloviecikSplodeny;

        if(man==true){
            cloviecikSplodeny=new Muz(stymtomuzom,this,32);
            super.deti.add(cloviecikSplodeny);
            stymtomuzom.deti.add(cloviecikSplodeny);
        }else{
            cloviecikSplodeny=new Zena(stymtomuzom,this,32);
            super.deti.add(cloviecikSplodeny);
            stymtomuzom.deti.add(cloviecikSplodeny);
        }
        cloviecikSplodeny.surname=super.surname+"-"+stymtomuzom.surname;
        babeInsideCare(cloviecikSplodeny);
        return cloviecikSplodeny;
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
            sustavas.add(6, new Rozmnozovacia_sustava_Zena(Typ_sustavy.ROZMNOZOVACIA));
            sustavas.add(7, new Nervova_sustava_cicavec(Typ_sustavy.NERVOVA));

            System.out.println("som zena a mam taku sustavu");
        }

        public void babeInsideCare(Clovek plod){
            Rozmnozovacia_sustava_Zena myRS=(Rozmnozovacia_sustava_Zena) sustavas.get(6);
            myRS.takeAndCareBaby(plod);
        }


}
