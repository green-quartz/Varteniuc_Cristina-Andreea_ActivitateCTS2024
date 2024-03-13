package A_3.fabrici;

import A_3.clase.Brancardier;
import A_3.clase.PersonalSpital;

public class FactoryBrancardier implements FactoryAngajati{
    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Brancardier(nume,salariu);
    }
}
