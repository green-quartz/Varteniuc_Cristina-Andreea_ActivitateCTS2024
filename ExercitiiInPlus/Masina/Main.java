package Masina;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        AMasina aMasina=new MasinaTunata("Andrei","Mercedes","123",0,null,null,null,
                null,null);
        AMasina masina2= new MasinaTunata("Anca","BMW", "355",4,ETipMaterial.METAL,null,null,
                null,null);
        AMasina masina3 = new MasinaTunata("Ionel", "Skoda", "2532", 0, null,
                new ArrayList<ETipMaterial>(List.of(ETipMaterial.PLASTIC, ETipMaterial.METAL)), null,null,null);
        AMasina masina4=new MasinaTunata("Cata","VW","56246",4,null, null, null,  null,null);
        System.out.println(aMasina);
        System.out.println(masina2);
        System.out.println(masina3);
        System.out.println(masina4);
    }
}
