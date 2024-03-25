package C_1_FactorySimple.clase;

public abstract class Medicamente {
    private String nume;
    private int cantitate;
    public abstract void afisare();

    public Medicamente(String nume, int cantitate) {
        this.nume = nume;
        this.cantitate = cantitate;
    }

    public String getNume() {
        return nume;
    }

    public int getCantitate() {
        return cantitate;
    }
}
