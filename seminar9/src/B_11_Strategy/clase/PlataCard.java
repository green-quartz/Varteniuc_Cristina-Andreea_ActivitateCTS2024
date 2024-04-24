package B_11_Strategy.clase;

public class PlataCard extends ModPlata{
    private double sold;

    public PlataCard(double sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(double suma, String nume) {
        if(this.sold >= suma) {
            System.out.println(nume + " a platit suma " + suma + " cu cardul.");
            this.sold -= suma;
        }else{
            this.succesor.plateste(suma,nume);
        }
    }
}