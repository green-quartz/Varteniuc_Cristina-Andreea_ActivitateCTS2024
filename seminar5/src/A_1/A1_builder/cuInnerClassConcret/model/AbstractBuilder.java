package A_1.A1_builder.cuInnerClassConcret.model;

public interface AbstractBuilder {
    public abstract AbstractBuilder adaugaPatRabatabil(boolean arePatRabatabil);
    public abstract AbstractBuilder adaugaMicDejunInclus(boolean areMicDejunInclus);
    public abstract AbstractBuilder adaugaPapuciCamera(boolean arePapuciCamera);
    public abstract AbstractBuilder adaugaHalatInterior(boolean areHalatInterior);

    public abstract Pacient build();
}
