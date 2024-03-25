package E_1_FactorySimple.clase;

import E_1_FactorySimple.clase.Jucator;

public class Portar extends Jucator {
    public Portar(String nume, int varsta) {
        super(nume, varsta);
    }

    @Override
    public void afisare() {
        System.out.println("Portarul cu numele "+this.getNume()+" are varsta de "+this.getVarsta()+ " ani.");
    }
}
