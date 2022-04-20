package zive_tvory.stavovce_diely.sustavy.Nervova;

import java.util.ArrayList;

public class Miecha {
   // public Miecha(Neuron[] neuronova_siet) {
   //     this.neuronova_siet = neuronova_siet;
   // }

   // private Neuron[] neuronova_siet = new Neuron[500];
    int i;
    private ArrayList <Integer> neuronova_siet= new ArrayList<>();
    public Miecha() {
        for( i=0;i<500;i++) {
            neuronova_siet.add(0);
        }
    }
}
