package B_2_Builder;

public class RezervareBuilder implements AbstractBuilder{
    private Rezervare rezervare;

    public RezervareBuilder (String nume, String genMuzical){
        this.rezervare=new Rezervare();
        rezervare.setNume(nume);
        rezervare.setGenMuzica(genMuzical);
    }
    @Override
    public AbstractBuilder adaugaAsezareLageam() {
        rezervare.setAsezareLageam(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaScauneErgonomic() {
        rezervare.setScauneErgonomice(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaDecorMasa() {
        rezervare.setDecorareaMesei(true);
        return this;
    }

    @Override
    public AbstractBuilder adaugaMuzicaAbientala() {
        rezervare.setMuzicaAbientala(true);
        return this;
    }

//    @Override
//    public AbstractBuilder adaugaGenMuzica(String personalizareMuzica) {
//            rezervare.setGenMuzica(personalizareMuzica);
//
//        return this;
//    }

    @Override
    public Rezervare build() {
        return rezervare;
    }
}
