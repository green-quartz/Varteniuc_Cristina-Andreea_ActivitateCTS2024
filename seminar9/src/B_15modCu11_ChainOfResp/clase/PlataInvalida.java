package B_15modCu11_ChainOfResp.clase;

public class PlataInvalida extends ModPlata{
    @Override
    public void plateste(int suma, String nume) {
        System.out.println(nume + " nu are fonduri sufieciente pentru realizarea platii");
    }
}