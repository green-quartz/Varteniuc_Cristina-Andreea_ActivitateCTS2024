package B_3_FactorySimple.clase;

public abstract class Supe {
    private int cantitate;
    private int nrIngrediente;

    public abstract void afisare();

    public Supe(int cantitate, int nrIngrediente) {
        this.cantitate = cantitate;
        this.nrIngrediente = nrIngrediente;
    }

    public int getCantitate() {
        return cantitate;
    }

    public int getNrIngrediente() {
        return nrIngrediente;
    }
}
