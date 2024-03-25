package B_3_FactorySimple.clase;

public class SupaDeVita extends Supe {
    public SupaDeVita(int cantitate, int nrIngrediente) {
        super(cantitate, nrIngrediente);
    }

    @Override
    public void afisare() {
        System.out.println("Supa de vita cu cantitatea de"+super.getCantitate()+" grame are "+super.getNrIngrediente()+" ingrediente");

    }
}
