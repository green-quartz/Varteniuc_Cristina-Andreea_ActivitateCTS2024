package model.animal;

public class Leu extends Animal{
    public Leu(String nume, int varsta, int nrPicioare) {
        super(nume, String.valueOf(varsta), nrPicioare);
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Leul " + getNume()+ "mananca "+ mancare);
    }
}
