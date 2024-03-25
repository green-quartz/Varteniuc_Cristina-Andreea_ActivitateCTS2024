package B_3_FactorySimple.clase;

public class SupaDeCiuperci extends Supe {
    public SupaDeCiuperci(int cantitate, int nrIngrediente) {
        super(cantitate, nrIngrediente);
    }

    @Override
    public void afisare() {
        System.out.println("Supa de ciuperci cu cantitatea de"+super.getCantitate()+" grame are "+super.getNrIngrediente()+" ingrediente");
    }
}
