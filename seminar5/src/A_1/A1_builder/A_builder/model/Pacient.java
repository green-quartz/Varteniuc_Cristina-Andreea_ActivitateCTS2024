package A_1.A1_builder.A_builder.model;

public class Pacient {
    private String nume;
    private boolean arePatRabatabil;
    private boolean areMicDejunInclus;
    private boolean arePapuciCamera;
    private boolean areHalatInterior;

    public Pacient() {
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setArePatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
    }

    public void setAreMicDejunInclus(boolean areMicDejunInclus) {
        this.areMicDejunInclus = areMicDejunInclus;
    }

    public void setArePapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
    }

    public void setAreHalatInterior(boolean areHalatInterior) {
        this.areHalatInterior = areHalatInterior;
    }
}
