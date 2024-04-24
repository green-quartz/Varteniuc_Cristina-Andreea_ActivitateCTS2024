package B_12_Observer.restaurant;

public class Restaurant extends Subiect{

    private String adresa;

    public Restaurant( String adresa) {
        this.adresa=adresa;
    }

    @Override
    public void notificareSchimbarePret() {
        notificareClientiAbonati("Restaurant de la adresa: "+this.adresa+" si-a schimbat preturile.");
    }

    @Override
    public void notificareSchimbareMeniu() {
        notificareClientiAbonati("Restaurant de la adresa: "+this.adresa+" si-a schimbat meniul.");
    }

    @Override
    public void notificareEveniment(String data) {
        notificareClientiAbonati("Restaurant de la adresa: "+this.adresa+" va desfasura un eveniment foarte special la data de "+data+'.');
    }
}
