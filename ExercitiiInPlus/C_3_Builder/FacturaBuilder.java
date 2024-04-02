package C_3_Builder;



public class FacturaBuilder implements AbstracBuilder {
    private Factura factura;

    public FacturaBuilder(String nrFactura){
        this.factura=new Factura();
        factura.setNrFactura(nrFactura);
    }


    @Override
    public AbstracBuilder adaugaPungi() {
        factura.setCerePungi(true);
        return this;
    }

    @Override
    public AbstracBuilder adaugaPlataCard() {
        factura.setPlataCard(true);
        return this;
    }

    @Override
    public AbstracBuilder adaugaCardFidelitate() {
        factura.setCardFidelitate(true);
        return this;
    }

    @Override
    public AbstracBuilder adaugaCotaTVA() {
        factura.setCotaTVA(true);
        return this;
    }

    @Override
    public Factura build() {
        return factura;
    }
}
