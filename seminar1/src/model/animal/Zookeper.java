package model.animal;

public class Zookeper {
    private String nume;

    public Zookeper(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void hranesteAnimal(Vietate vietate, String mancare){
        vietate.eat(mancare);
    }
}
