package E_3_Builder;

public interface AbstractBuilder {
    public abstract AbstractBuilder adaugaMancareInclusa();
    public abstract AbstractBuilder adaugaScaunErgonomic();
    public abstract AbstractBuilder adaugaBauturaRacoritoare();
    public abstract AbstractBuilder adaugaMuzicaAbientala();

    public abstract Client build();
}
