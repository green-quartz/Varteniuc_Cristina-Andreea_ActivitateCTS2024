package A_3.fabrici;

import A_3.clase.Asistent;
import A_3.clase.PersonalSpital;

public class FactoryAsistent implements FactoryAngajati {

    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Asistent(nume,salariu);
    }
}
