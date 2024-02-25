package model.animal;

public class Maimuta extends Animal{
    public Maimuta(String nume, int varsta, int nrPicioare) {
        super(nume, String.valueOf(varsta), nrPicioare);
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Maimuta "+getNume()+" mananca "+mancare);
    }
}
