package C_3_Builder;



import java.nio.file.attribute.FileAttributeView;

public interface AbstracBuilder {
    public abstract AbstracBuilder adaugaPungi();
    public abstract  AbstracBuilder adaugaPlataCard();
    public abstract AbstracBuilder adaugaCardFidelitate();
    public abstract AbstracBuilder  adaugaCotaTVA();
    public abstract Factura build();
}
