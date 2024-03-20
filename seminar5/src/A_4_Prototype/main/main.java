package A_4_Prototype.main;

import A_4_Prototype.model.AbstractReteta;
import A_4_Prototype.model.Reteta;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[]args)
    {
        Map<String,Double> hartaIngrediente=new HashMap<>();
        hartaIngrediente.put("HCl",5.0);
        hartaIngrediente.put("Vitamina C",10.0);
        hartaIngrediente.put("Vitamina D",11.3);
        AbstractReteta reteta1=new Reteta("Mig400",hartaIngrediente,26.3);
        AbstractReteta reteta2=reteta1.cloneaza();
        reteta2.setNumeMedicament("Altceva");
        System.out.println(reteta1);
        System.out.println(reteta2);
        System.out.println(reteta1);
    }
}
