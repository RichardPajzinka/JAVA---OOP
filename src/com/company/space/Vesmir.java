package com.company.space;

public class Vesmir {
    private boolean state;
    private long size;
    private long velkost;
   // private long diseredSize;
    private String stvoritel;


    public Vesmir() {
        state = false;
        size = 0;
        velkost = 999000;
       // diseredSize = 998999;
        stvoritel = "Richard Pajzinka";
    }

    public void startVesmir(){
        state=true;
        System.out.println("Vesmir je zapnuty");
        increaseSize();
    }

    public void stopVesmir(){
        state=false;
        System.out.println("Vesmir sa vypol");
    }

    private void increaseSize(){
        if (state = true) {
            while (size < velkost)
                size++;
        }
        System.out.println("velkost " + size + " km3 ");
    }

    public void decreaseSize(long diseredSize){
        if (diseredSize > size){
            System.out.println("stvoritel sa asi pomylil vo velkosti");
        }
        while(size > diseredSize){
            size = size - 1;
            System.out.println("aktualna velkost " + size );
        }

    }

}
