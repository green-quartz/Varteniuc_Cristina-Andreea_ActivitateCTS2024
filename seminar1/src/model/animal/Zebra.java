package model.animal;

public class Zebra extends Animal{
    public Zebra(String nume, int varsta, int nrPicioare) {
        super(nume, String.valueOf(varsta), nrPicioare);
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Zebra "+getNume()+" mananca "+mancare);
    }
}
