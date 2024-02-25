package model.animal;

public abstract class Animal implements Vietate {
    private String nume;
    private String varsta;
    private int  nrPicioare;

    public Animal(String nume, String varsta, int nrPicioare) {
        this.nume = nume;
        this.varsta = varsta;
        this.nrPicioare = nrPicioare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getVarsta() {
        return varsta;
    }

    public void setVarsta(String varsta) {
        this.varsta = varsta;
    }

    public int getNrPicioare() {
        return nrPicioare;
    }

    public void setNrPicioare(int nrPicioare) {
        this.nrPicioare = nrPicioare;
    }
}
