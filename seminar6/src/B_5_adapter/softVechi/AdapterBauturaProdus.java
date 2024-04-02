package B_5_adapter.softVechi;

import B_5_adapter.softNou.Bautura;

public class AdapterBauturaProdus extends Produs{
    private Bautura bautura;

    public AdapterBauturaProdus(Bautura bautura){
        super(bautura.getDenumire(), bautura.getPret());
        this.bautura = bautura;
    }

}
