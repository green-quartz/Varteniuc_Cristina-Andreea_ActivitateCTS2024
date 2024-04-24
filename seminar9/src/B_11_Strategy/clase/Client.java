package B_11_Strategy.clase;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public Client(String nume) {
        this.nume = nume;
        this.modPlata=new PlataCard(34.0);
        ModPlata mod2=new PlataCash(93.0);
        ModPlata mod3=new PlataInvalida();

        this.modPlata.setSuccesor(mod2);
        mod2.setSuccesor(mod3);
    }

    public void realizeazaPlata(double suma){
        this.modPlata.plateste(suma,this.nume);
    }
}