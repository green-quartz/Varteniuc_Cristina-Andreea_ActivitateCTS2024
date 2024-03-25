package D_1_FactorySimple.clase;

import D_1_FactorySimple.clase.Credit;

public class CreditNevoiPersonale extends Credit {
    public CreditNevoiPersonale(String nume, float valoare) {
        super(nume, valoare);
    }

    @Override
    public void afisare() {
        System.out.println("Creditul de nevoi personale se numeste "+this.getNume()+" si are valoare "+this.getValoare());
    }
}
