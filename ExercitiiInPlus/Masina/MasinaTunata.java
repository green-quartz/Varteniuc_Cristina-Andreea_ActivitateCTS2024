package Masina;

import java.util.List;

public class MasinaTunata extends AMasina{
    private String nume;
    private ETipMaterial materialInterior;
    private ETipMaterial materialUsi;
    private ETipMaterial materialScaune;
    public MasinaTunata(String nume, String marca, String serieSasiu, int nrBoxe, ETipMaterial tipMaterial, List<ETipMaterial> lista,
                        ETipMaterial  materialInterior, ETipMaterial materialUsi, ETipMaterial materialScaune) {
        this.nume=nume;
        this.marca=marca;
        this.serieSasiu=serieSasiu;
        this.nrBoxe=nrBoxe;
        this.material=tipMaterial;
        this.materialeSuplimentare=lista;
        this.materialInterior=materialInterior;
        this.materialUsi=materialUsi;
        this.materialScaune=materialScaune;
    }

    @Override
    public String toString() {
        return "MasinaTunata{" +
                "nume='" + nume + '\'' +
                ", marca='" + marca + '\'' +
                ", serieSasiu='" + serieSasiu + '\'' +
                ", nrBoxe=" + nrBoxe +
                ", material=" + material +
                ", materialeSuplimentare=" + materialeSuplimentare +
                ", materialInterior=" + materialInterior +
                ", materialUsi=" + materialUsi +
                ", materialScaune=" + materialScaune +
                '}';
    }

    @Override
    void addMaterial(ETipMaterial tipMaterial) {
        materialeSuplimentare.add(tipMaterial);
    }
}
