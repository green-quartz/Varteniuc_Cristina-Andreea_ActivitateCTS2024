package C_1_FactorySimple.clase;

public class FactoryMedicament {
    public Medicamente creareMedicament(CategoriiMedicamente categoriiMedicamente, String nume, int cantitate)
    {
        switch (categoriiMedicamente){
            case RACEALA:new Raceala(nume, cantitate);
            case DURERE:new Durere(nume, cantitate);
            case BODY:new Body(nume, cantitate);
            default: return null;
        }
    }
}
