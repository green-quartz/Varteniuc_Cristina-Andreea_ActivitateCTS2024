package D_1_FactorySimple.clase;

import D_1_FactorySimple.clase.Credit;

public class CreditIpotecar extends Credit {
    public CreditIpotecar(String nume, float valoare) {
        super(nume, valoare);
    }

    @Override
    public void afisare() {
        System.out.println("Creditul ipotecar se numeste "+this.getNume()+" si are valoare "+this.getValoare());
    }
}
