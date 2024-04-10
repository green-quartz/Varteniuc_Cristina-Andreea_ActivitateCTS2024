package E_7_Decorator.decoratoare;

import E_7_Decorator.clase.BiletAbstract;

public class BiletLocal extends DecoratorBilet{

    private double valoareDiscount=0.9;

    public BiletLocal(String echipaGazda, String echipaOaspeti, double pret) {
        super(echipaGazda, echipaOaspeti, pret);
    }

    public BiletLocal(BiletAbstract biletDecorat) {
        super(biletDecorat);
    }

    @Override
    public void printareBilet() {
        this.getBiletAbstract().printareBilet();
        System.out.println("Hai ca poti "+ this.getEchipaGazda());
    }

    @Override
    public void aplicaDiscountBilet() {
        this.getBiletAbstract().setPret(this.getBiletAbstract().getPret()*valoareDiscount);
    }
}