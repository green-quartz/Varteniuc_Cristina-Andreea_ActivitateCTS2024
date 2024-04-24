package B_15modCu11_ChainOfResp.clase;

import B_15modCu11_ChainOfResp.main.Card;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public Client(String nume) {
        this.nume = nume;
        modPlata = new Card(34);
        ModPlata mod2 = new Cash(93);
        ModPlata mod3 = new PlataInvalida();
        this.modPlata.setSuccesor(mod2);
        mod2.setSuccesor(mod3);
    }

    public void realizeazaPlata(int suma){
        modPlata.plateste(suma,this.nume);
    }
}
