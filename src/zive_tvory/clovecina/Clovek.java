package zive_tvory.clovecina;

import zive_tvory.bornable;
import zive_tvory.cicavce.Cicavec;
import zive_tvory.cicavce.Materske_mlieko;
import zive_tvory.dieable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Clovek extends Cicavec implements bornable, dieable {
    protected Clovek otec;


    protected Clovek mama;
    protected List<Clovek> deti;

    protected String name;
    protected String surname;
    @Override
    public String toString() {
        return "Clovek{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }




    public Clovek(int pocet_stavcov, int temperature) {
        super(pocet_stavcov, temperature);
    }

    public Clovek(Clovek otec, Clovek mama,int pocet_stavcov) {
        super(pocet_stavcov);
         this.otec=otec;
         this.mama=mama;

         deti=new ArrayList();
    }


    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void cicat(Cicavec mama) {
        super.cicat(mama);
    }

    @Override
    public void cicat(Materske_mlieko mliecko) {
        super.cicat(mliecko);
    }

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {
        super.hybsa(direction_x, direction_y, direction_z);
    }

    @Override
    public void born(Date day_of_birth) {
        super.born(day_of_birth);
    }

    @Override
    public void die(Date day_of_death) {
        super.die(day_of_death);
    }
}
