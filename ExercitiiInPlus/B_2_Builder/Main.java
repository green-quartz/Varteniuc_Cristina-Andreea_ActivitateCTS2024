package B_2_Builder;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder = new RezervareBuilder("Andrei", "rock") ;
        Rezervare rezervare=builder.adaugaAsezareLageam().adaugaMuzicaAbientala().build();
        System.out.println(rezervare);
    }
}
