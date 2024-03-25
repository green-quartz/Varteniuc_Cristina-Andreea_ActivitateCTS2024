package E_1_FactorySimple.clase;

public abstract class Jucator {
    private String nume;
    private int varsta;

    public abstract void afisare();

    public Jucator(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }
}
