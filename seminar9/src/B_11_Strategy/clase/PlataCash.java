package B_11_Strategy.clase;

public class PlataCash extends ModPlata{
    private double cashDisponibil;

    public PlataCash(double cashDisponibil) {
        this.cashDisponibil = cashDisponibil;
    }

    @Override
    public void plateste(double suma, String nume) {
        if(this.cashDisponibil >= suma) {
            System.out.println(nume+" a platit suma "+suma+" sub forma cash.");
            this.cashDisponibil -= suma;
        }else{
            this.succesor.plateste(suma,nume);
        }
    }
}