package E_7_Decorator.main;

import E_7_Decorator.clase.Bilet;
import E_7_Decorator.clase.BiletAbstract;
import E_7_Decorator.decoratoare.BiletLocal;
import E_7_Decorator.decoratoare.BiletNational;
import E_7_Decorator.decoratoare.DecoratorBilet;

public class Main {
    public static void main(String[] args) {

        BiletAbstract bilet1=new Bilet("A","B",10.0);
        imprimantaBilete(bilet1);

        DecoratorBilet bilet2=new BiletLocal(bilet1);
        bilet2.aplicaDiscountBilet();
        imprimantaBilete(bilet2);

        DecoratorBilet bilet3=new BiletNational("Romania","Danemarca",20.0);
        bilet3.aplicaDiscountBilet();
        imprimantaBilete(bilet3);
    }

    public static void imprimantaBilete(BiletAbstract biletAbstract) {
        biletAbstract.printareBilet();
    }
}