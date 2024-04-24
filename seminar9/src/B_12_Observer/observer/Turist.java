package B_12_Observer.observer;

public class Turist implements Observer{
    private String nume;

    public Turist(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println("Turistul "+this.nume+" a primit notificarea: "+mesaj);
    }
}
