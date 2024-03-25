package C_1_FactorySimple.clase;

public class Body extends Medicamente {
    public Body(String nume, int cantitate) {
        super(nume, cantitate);
    }

    @Override
    public void afisare() {
        System.out.println("Medicamentul "+super.getNume()+" este pentru body si avem cantitate in farmacie "+super.getCantitate()+ " comprimate");
    }
}
