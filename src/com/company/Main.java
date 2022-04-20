package com.company;
import auta.Auto;
import auta.UniverseCarFactory;
import com.company.space.*;
import tools.MessageReader;
import tools.Vypis;
import vesmirnetelesa.*;
import vesmirnetelesa.galaxia.Galaxia;
import vesmirnetelesa.galaxia.Slnecna_sustava;
import zive_tvory.clovecina.Clovek;
import zive_tvory.clovecina.Muz;
import zive_tvory.clovecina.Zena;
import zive_tvory.stavovce.Hmyz.Mucha;
import zive_tvory.stavovce.Ryby.Kapor;
import zive_tvory.Tvor;
import zive_tvory.stavovce.Ryby.Zralog;
import zive_tvory.stavovce.Vtaky.Orol;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Main {


    public static void main(String[] args) {
	Vesmir mojprvyvesmir = new Vesmir();
    mojprvyvesmir.startVesmir();

    Planeta Mars = new Planeta("Mars",7000000,124545);

    Slnecna_sustava andromeda = new Slnecna_sustava();
    andromeda.addTeleso(Mars);
    mojprvyvesmir.decreaseSize(998999);

    Zem MatickaZem = new Zem("Zem",150000,78900);

    //Planeta Zem = new Planeta("Zem",3000000,12756);
    //Zem.setVaha(2000);
    //Zem.setPlanetaryWeight(2000000);

    Hviezda Slnko = new Hviezda("Slnko",102,5000,100);
    Slnko.sviet();

    //Planeta[] pole_planet = new Planeta[5];
     //   int i=0;
      //  while(i<5){
       //     pole_planet[i] = new Planeta();
        //    i++;
       // }

        Planeta Merkur = new Planeta("Merkur",3000000,112522);
        Planeta Venusa = new Planeta("Venusa",5000000,12745);
      //  Planeta Mars = new Planeta("Mars",7000000,124545);
        Planeta Jupiter = new Planeta("Jupiter",9000000,124841);
        Planeta Saturn = new Planeta("Saturn",5400000,424512);
        Planeta Uran = new Planeta("Uran",9000000,324515);
        Planeta Neptun = new Planeta("Neptun",5000000,9271451);
        Planeta Pluto = new Planeta("Pluto",1000000,52656);



        Galaxia Mliecna_cesta = new Galaxia();
        Mliecna_cesta.addSustava(andromeda);



    for(int i =0;i<165;i++){
       // MatickaZem.addTvora(new Ryba());
        //MatickaZem.addTvora(new Vtak());
        //MatickaZem.addTvora(new Zralog());
    }

        Tvor[] pole = MatickaZem.getPoleTvorov();
    for(int i =0;i< MatickaZem.getPocet_tvorov();i++){
        pole[i].hybsa(10,10,0);
      //  MatickaZem.addTvora(new Vtak());
    }


        Kapor vianocnykapor = new Kapor(20);
        Date dNow = new Date();
        vianocnykapor.born(dNow);


        MatickaZem.addTvora(vianocnykapor);
        vianocnykapor.hybsa(10,10,0);
       // vianocnykapor.die();

        Zralog zralocik = new Zralog(50);
        MatickaZem.addTvora(zralocik);
        MatickaZem.delTvora(zralocik);

        Orol orlik = new Orol(40);
        MatickaZem.addTvora(orlik);
        MatickaZem.delTvora(orlik);

        Mucha vinnamuska = new Mucha();
        MatickaZem.addTvora(vinnamuska);
        MatickaZem.delTvora(vinnamuska);

        //for(int i=0;i<vianocnykapor.getSustavas().length;i++){
         //   System.out.println(vianocnykapor.getSustavas()[i].getTypSustavy());
       // }
    Hmlovina hmlovina1 = new Hmlovina();
    Hmlovina hmlovina2 = new Hmlovina();
    Hmlovina hmlovina3 = new Hmlovina();



        Muz prvyMuz = new Muz(null,null,32,"Adam","Prvy");
        Zena prvaZena = new Zena(null,null,35,"Eva","Prva");
        System.out.println(prvyMuz);
        System.out.println(prvaZena);

        System.out.println(prvyMuz);
        System.out.println(prvaZena);

        Clovek prvedieta = prvaZena.splodit(prvyMuz);
        prvedieta.born(dNow);
        prvedieta.setName("Kain");

        Clovek druhedieta = prvaZena.splodit(prvyMuz);
        druhedieta.born(dNow);
        druhedieta.setName("Abel");

        MatickaZem.addTvora(prvyMuz);
        MatickaZem.addTvora(prvaZena);
        MatickaZem.addTvora(prvedieta);
        MatickaZem.addTvora(druhedieta);

        MessageReader AdamovReader = new MessageReader();
        AdamovReader.obtainFilename(args);
        AdamovReader.openAndRead();
        AdamovReader.processMessage();


        //Vypis NovyVypis = new Vypis();
       // NovyVypis.WriteToFile(MatickaZem.getMenaTvorov());


        Stvoritel mojstvoritel = Stvoritel.getInstance();

        mojprvyvesmir.stopVesmir();


        UniverseCarFactory mojatovarennaauta = new UniverseCarFactory("Unicar");
        Auto mojempvcko = mojatovarennaauta.produce("MPV");
        System.out.println(mojempvcko);

        Auto mojeminiauto = mojatovarennaauta.produce("mini_auto");


        List<Auto> sklad = new ArrayList<>();
        for (int i =0;i<1000;i++){
            sklad.add(mojatovarennaauta.produce("mini_auto"));
            sklad.add(mojatovarennaauta.produce("SUV"));
        }


    }
}
