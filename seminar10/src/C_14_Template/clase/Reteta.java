package C_14_Template.clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta {
    private int nrReteta;
    private List<String> listaMedicamente;

    public Reteta(int nrReteta) {
        this.nrReteta = nrReteta;
        listaMedicamente = new ArrayList<>();
    }

    public void adaugaMedicament(String medicamente) {
        listaMedicamente.add(medicamente);
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public List<String> getListaMedicamente() {
        return listaMedicamente;
    }
}
