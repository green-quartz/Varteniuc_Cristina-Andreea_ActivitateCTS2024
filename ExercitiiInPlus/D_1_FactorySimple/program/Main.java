package D_1_FactorySimple.program;

import D_1_FactorySimple.clase.Credit;
import D_1_FactorySimple.clase.FactoryCredit;
import D_1_FactorySimple.clase.TipCredite;

public class Main {
    public static void main(String[] args) {
        FactoryCredit factoryCredit=new FactoryCredit();
        Credit nevoi= factoryCredit.creareCredit(TipCredite.PERSONALE, "Personla",100);
        Credit ipotecar = factoryCredit.creareCredit(TipCredite.IPOTECARE, "Ip", 1000000);
        nevoi.afisare();
        ipotecar.afisare();
    }
}
