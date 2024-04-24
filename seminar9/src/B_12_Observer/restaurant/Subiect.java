package B_12_Observer.restaurant;

import B_12_Observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer> listaObserveri;

    public Subiect() {
        this.listaObserveri = new ArrayList<>();
    }

    public void abonareClient(Observer client){
        this.listaObserveri.add(client);
    }

    public void dezabonareClient(Observer client){
        this.listaObserveri.remove(client);
    }

    protected void notificareClientiAbonati(String mesaj){
        for (Observer client:this.listaObserveri){
            client.primesteNotificare(mesaj);
        }
    }

    public abstract void notificareSchimbarePret();
    public abstract void notificareSchimbareMeniu();
    public abstract void notificareEveniment(String data);
}
