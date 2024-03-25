package E_1_FactorySimple.clase;

public class Atacant extends Jucator {
    public Atacant(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afisare() {
        System.out.println("Atacantul cu numele "+this.getNume()+" are varsta de "+this.getVarsta()+ " ani.");
    }
}
