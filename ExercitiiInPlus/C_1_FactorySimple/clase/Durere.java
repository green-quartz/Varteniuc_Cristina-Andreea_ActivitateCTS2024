package C_1_FactorySimple.clase;

public class Durere extends Medicamente {
    public Durere(String nume, int cantitate) {
        super(nume, cantitate);
    }

    @Override
    public void afisare() {
        System.out.println("Medicamentul "+super.getNume()+" este pentru durere si avem cantitate in farmacie "+super.getCantitate()+ " comprimate");
    }
}
