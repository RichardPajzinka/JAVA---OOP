package vesmirnetelesa;

import com.company.space.Vesmir;

public class Stvoritel {
    private static Stvoritel instance = null;
    private static Vesmir vesmir= new Vesmir();


    private Stvoritel(){

    }

    public static Stvoritel getInstance(){
        if(instance == null){
            instance = new Stvoritel();
        }
        return instance;
    }

    public static void takeVesmir(Vesmir mojvesmir){
        vesmir=mojvesmir;
    }

}
