package A_3.fabrici;

import A_3.clase.Medic;
import A_3.clase.PersonalSpital;

public class FactoryMedic implements FactoryAngajati{
    @Override
    public PersonalSpital creareAngajat(String nume, int salariu) {
        return new Medic(nume,salariu);
    }
}