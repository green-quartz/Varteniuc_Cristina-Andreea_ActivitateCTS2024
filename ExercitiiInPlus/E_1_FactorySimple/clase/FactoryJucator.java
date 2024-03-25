package E_1_FactorySimple.clase;

public class FactoryJucator {
    public Jucator creareJucator(TipJucator tipJucator, String nume, int varsta){
        switch (tipJucator){
            case ATACANT:return new Atacant(nume, varsta);
            case FUNDAS: return new Fundas(nume, varsta);
            case PORTAR: return new Portar(nume, varsta);
            default:return null;
        }
    }
}
