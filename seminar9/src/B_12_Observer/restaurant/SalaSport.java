package B_12_Observer.restaurant;

public class SalaSport extends Subiect{
    @Override
    public void notificareSchimbarePret() {
        throw new UnsupportedOperationException("Nu exista notificare de pret pentru sala de sport");
    }

    @Override
    public void notificareSchimbareMeniu() {
        throw new UnsupportedOperationException("Nu exista notificare de meniu pentru sala de sport");
    }

    @Override
    public void notificareEveniment(String data) {
        notificareClientiAbonati("In sala de sport va fi un eveniment calitativ la data de "+data);
    }

    public void notificareMeciVolei(String data){
        notificareClientiAbonati("In sala de sport va fi un meci de volei la data de "+data);
    }
}
