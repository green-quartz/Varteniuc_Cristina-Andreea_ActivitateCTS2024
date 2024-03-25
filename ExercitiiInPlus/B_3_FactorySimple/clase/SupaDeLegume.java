package B_3_FactorySimple.clase;

public class SupaDeLegume extends Supe {


    public SupaDeLegume(int cantitate, int nrIngrediente) {
        super(cantitate, nrIngrediente);
    }
    @Override
    public void afisare() {
        System.out.println("Supa de legume cu cantitatea de"+super.getCantitate()+" grame are "+super.getNrIngrediente()+" ingrediente");
    }
}
