package D_1_FactorySimple.clase;

public abstract class Credit {
    private String nume;
    private float valoare;

    public abstract void afisare();

    public Credit(String nume, float valoare) {
        this.nume = nume;
        this.valoare = valoare;
    }

    public String getNume() {
        return nume;
    }

    public float getValoare() {
        return valoare;
    }
}
