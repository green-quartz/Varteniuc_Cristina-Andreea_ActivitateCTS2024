package E_1_FactorySimple.clase;

public class Fundas extends Jucator {
    public Fundas(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afisare() {
        System.out.println("Fundasul cu numele "+this.getNume()+" are varsta de "+this.getVarsta()+ " ani.");
    }
}
