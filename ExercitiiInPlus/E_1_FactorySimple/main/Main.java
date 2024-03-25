package E_1_FactorySimple.main;

import E_1_FactorySimple.clase.FactoryJucator;
import E_1_FactorySimple.clase.Jucator;
import E_1_FactorySimple.clase.TipJucator;

public class Main {
    public static void main(String[] args) {
        FactoryJucator factoryJucator=new FactoryJucator();
        Jucator atacant = factoryJucator.creareJucator(TipJucator.ATACANT,"A",1);
        Jucator funundas= factoryJucator.creareJucator(TipJucator.FUNDAS, "F", 2);
        Jucator portar= factoryJucator.creareJucator(TipJucator.PORTAR,"P",3);
        atacant.afisare();
        funundas.afisare();
        portar.afisare();
    }
}
