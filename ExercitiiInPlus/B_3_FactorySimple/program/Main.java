package B_3_FactorySimple.program;

import B_3_FactorySimple.clase.FactorySupe;
import B_3_FactorySimple.clase.Supe;
import B_3_FactorySimple.clase.TipSupa;

public class Main {
    public static void main(String[] args)
    {
        FactorySupe factorySupe=new FactorySupe();
        Supe supaDeCiuperci= factorySupe.creareSupa(TipSupa.CIUPERCI,1,1);
        Supe supaDeVita= factorySupe.creareSupa(TipSupa.VITA,2,2);
        Supe supaDeLegume= factorySupe.creareSupa(TipSupa.LEGUME,3,3);
        supaDeCiuperci.afisare();
        supaDeVita.afisare();
        supaDeLegume.afisare();
    }

}
