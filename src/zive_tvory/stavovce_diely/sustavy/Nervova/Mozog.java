package zive_tvory.stavovce_diely.sustavy.Nervova;

import java.util.ArrayList;

public class Mozog {


    int i;
    //private Neuron[] neuronova_siet = new Neuron[500];
    private ArrayList<Integer> neuronova_siet= new ArrayList<>();


    public Mozog() {
        for (i = 0; i < 500; i++) {
            neuronova_siet.add(0);
        }
    }
}
