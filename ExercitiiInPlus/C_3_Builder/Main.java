package C_3_Builder;



public class Main {
    public static void main(String[] args) {
        AbstracBuilder builder= new FacturaBuilder("ri23joij");
        Factura factura=builder.adaugaCotaTVA().adaugaCardFidelitate().build();
        System.out.println(factura);
    }
}
