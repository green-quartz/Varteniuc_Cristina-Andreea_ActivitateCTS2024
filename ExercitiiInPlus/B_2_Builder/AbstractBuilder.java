package B_2_Builder;

public interface AbstractBuilder {
    public abstract AbstractBuilder adaugaAsezareLageam();
    public abstract AbstractBuilder adaugaScauneErgonomic();
    public abstract AbstractBuilder adaugaDecorMasa();
    public  abstract AbstractBuilder adaugaMuzicaAbientala();

    public abstract Rezervare build();
}
