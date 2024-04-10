package E_7_Decorator.decoratoare;

import E_7_Decorator.clase.Bilet;
import E_7_Decorator.clase.BiletAbstract;

public abstract class DecoratorBilet extends BiletAbstract {

    private BiletAbstract biletAbstract;

    public DecoratorBilet(String echipaGazda, String echipaOaspeti, double pret) {
        super(echipaGazda, echipaOaspeti, pret);
        this.biletAbstract=new Bilet(echipaGazda,echipaOaspeti,pret);
    }

    public BiletAbstract getBiletAbstract() {
        return biletAbstract;
    }

    public DecoratorBilet(BiletAbstract biletDecorat) {
        super(biletDecorat.getEchipaGazda(), biletDecorat.getEchipaOaspeti(), biletDecorat.getPret());
        this.biletAbstract=biletDecorat;

    }

    public abstract void aplicaDiscountBilet();
}
