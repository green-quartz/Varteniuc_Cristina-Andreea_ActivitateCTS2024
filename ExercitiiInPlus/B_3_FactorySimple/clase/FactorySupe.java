package B_3_FactorySimple.clase;

public class FactorySupe {
    public Supe creareSupa(TipSupa tipSupa, int cantitate, int nrIngrediente){
        switch(tipSupa){
            case LEGUME : return new SupaDeLegume(cantitate,nrIngrediente);
            case CIUPERCI: return new SupaDeCiuperci(cantitate,nrIngrediente);
            case VITA: return new SupaDeVita(cantitate,nrIngrediente);
            default:return  null;
        }
    }
}
