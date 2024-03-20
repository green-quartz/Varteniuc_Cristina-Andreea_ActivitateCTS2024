package A_1.A1_builder.A_builder.model;

public interface AbstractBuilder {
    public abstract AbstractBuilder adaugaPatRabatabil();
    public abstract AbstractBuilder adaugaMicDejunInclus();
    public abstract AbstractBuilder adaugaPapuciCamera();
    public abstract AbstractBuilder adaugaHalatInterior();

    public abstract Pacient build();
}
