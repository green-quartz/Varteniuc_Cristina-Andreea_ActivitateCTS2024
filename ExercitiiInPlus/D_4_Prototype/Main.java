package D_4_Prototype;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,Double> conturi=new HashMap<>();
        conturi.put("1",1.0);
        conturi.put("2",2.0);
        AbstractCont cont1=new Cont("A",conturi);
        AbstractCont cont2=cont1.cloneaza();
        cont2.setNume("b");
        System.out.println(cont1);
        System.out.println(cont2);
        System.out.println(cont1);

    }
}
