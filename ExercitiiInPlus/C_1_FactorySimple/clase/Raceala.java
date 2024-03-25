package C_1_FactorySimple.clase;

import C_1_FactorySimple.clase.Medicamente;

public class Raceala extends Medicamente {
    public Raceala(String nume, int cantitate) {
        super(nume, cantitate);
    }

    @Override
    public void afisare() {
        System.out.println("Medicamentul "+super.getNume()+" este pentru raceala si avem cantitate in farmacie "+super.getCantitate()+ " comprimate");
    }
}
