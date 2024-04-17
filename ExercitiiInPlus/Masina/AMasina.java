package Masina;

import java.util.List;

public abstract class AMasina {
    protected String marca;
    protected String serieSasiu;
    protected int nrBoxe;
    protected ETipMaterial material;
    protected List<ETipMaterial> materialeSuplimentare;

    abstract  void addMaterial(ETipMaterial tipMaterial);
}
