package C_3_Builder;

public class Factura {
    private  String nrFactura;
    private boolean cerePungi;
    private boolean plataCard;
    private boolean cardFidelitate;
    private boolean cotaTVA;

    public Factura() {
    }

    public void setNrFactura(String nrFactura) {
        this.nrFactura = nrFactura;
    }

    public void setCerePungi(boolean cerePungi) {
        this.cerePungi = cerePungi;
    }

    public void setPlataCard(boolean plataCard) {
        this.plataCard = plataCard;
    }

    public void setCardFidelitate(boolean cardFidelitate) {
        this.cardFidelitate = cardFidelitate;
    }

    public void setCotaTVA(boolean cotaTVA) {
        this.cotaTVA = cotaTVA;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "nrFactura='" + nrFactura + '\'' +
                ", cerePungi=" + cerePungi +
                ", plataCard=" + plataCard +
                ", cardFidelitate=" + cardFidelitate +
                ", cotaTVA=" + cotaTVA +
                '}';
    }
}
