package model.zoo;

import model.animal.Animal;
import model.animal.Vietate;
import model.animal.Zookeper;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private String nume;
    private Zookeper ingrijitor;
    private Map<Vietate,String> vietate;
//yaghni
    public Zoo(String nume, Zookeper ingrijitor, Map<Vietate, String> vietate) {
        this.nume = nume;
        this.ingrijitor = ingrijitor;
        this.vietate = vietate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Zookeper getIngrijitor() {
        return ingrijitor;
    }

    public void setIngrijitor(Zookeper ingrijitor) {
        this.ingrijitor = ingrijitor;
    }

    public Map<Vietate, String> getVietate() {
        return vietate;
    }

    public void setVietate(Map<Vietate, String> vietate) {
        this.vietate = vietate;
    }

    public void adaugaAnimal(Vietate vietate1, String mancare){
        if(this.vietate==null)
        {
            this.vietate=new HashMap<>();
        }
        if(vietate!=null && mancare.length()>2)
        {
            this.vietate.put(vietate1,mancare);
        }
    }

    public void hranesteToateAnimalele(){
        for(Vietate vi: vietate.keySet()){
            ingrijitor.hranesteAnimal(vi,vietate.get(vi));
//           Nu face asta vi.eat(vietate.get(vi));

        }
    }
}
