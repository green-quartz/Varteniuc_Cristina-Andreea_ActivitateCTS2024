package D_1_FactorySimple.clase;

public class FactoryCredit {
    public Credit creareCredit(TipCredite tipCredite, String nume, float valoare){
        switch (tipCredite)
        {
            case PERSONALE: return new CreditNevoiPersonale(nume,valoare);
            case IPOTECARE: return new CreditIpotecar(nume,valoare);
            default: return null;
        }
    }
}
