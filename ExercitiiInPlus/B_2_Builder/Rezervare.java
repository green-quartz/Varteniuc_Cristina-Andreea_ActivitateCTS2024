package B_2_Builder;

public class Rezervare {
    private String nume;
    private boolean asezareLageam;
    private boolean scauneErgonomice;
    private boolean decorareaMesei;
    private boolean muzicaAbientala;
    private String genMuzica;

    public Rezervare() {
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAsezareLageam(boolean asezareLageam) {
        this.asezareLageam = asezareLageam;
    }

    public void setScauneErgonomice(boolean scauneErgonomice) {
        this.scauneErgonomice = scauneErgonomice;
    }

    public void setDecorareaMesei(boolean decorareaMesei) {
        this.decorareaMesei = decorareaMesei;
    }

    public void setMuzicaAbientala(boolean muzicaAbientala) {
        this.muzicaAbientala = muzicaAbientala;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "nume='" + nume + '\'' +
                ", asezareLageam=" + asezareLageam +
                ", scauneErgonomice=" + scauneErgonomice +
                ", decorareaMesei=" + decorareaMesei +
                ", muzicaAbientala=" + muzicaAbientala +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }
}
