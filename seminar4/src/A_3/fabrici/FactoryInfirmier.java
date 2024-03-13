package A_3.fabrici;

import A_3.clase.Infirmier;
import A_3.clase.PersonalSpital;

public class FactoryInfirmier implements FactoryAngajati{
    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Infirmier(nume,salariu);
    }
}
