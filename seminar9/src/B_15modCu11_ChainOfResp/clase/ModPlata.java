package B_15modCu11_ChainOfResp.clase;

public abstract class ModPlata {
    protected ModPlata succesor;

    public void setSuccesor(ModPlata modPlata) {
        this.succesor = modPlata;
    }

    public abstract void plateste(int suma, String nume);
}
