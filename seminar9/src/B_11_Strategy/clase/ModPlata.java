package B_11_Strategy.clase;

public abstract class ModPlata {
    protected ModPlata succesor;

    public void setSuccesor(ModPlata succesor) {
        this.succesor = succesor;
    }

    public abstract void plateste(double suma, String nume);
}