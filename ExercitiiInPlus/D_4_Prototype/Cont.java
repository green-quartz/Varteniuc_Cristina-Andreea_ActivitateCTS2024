package D_4_Prototype;


import java.util.HashMap;
import java.util.Map;

public class Cont implements AbstractCont {
    private String nume;
    Map<String,Double> cont;

    public Cont(String nume, Map<String,Double>cont){
        this.nume=nume;
        this.cont=cont;
    }

    private Cont()
    {

    }

    @Override
    public AbstractCont cloneaza() {
        Cont cont=new Cont();
        cont.nume=this.nume;
        cont.cont=new HashMap<>();
        for(String cheie:this.cont.keySet()){
            cont.cont.put(cheie,this.cont.get(cheie));
        }

        return cont;
    }


    public void setNume(String nume) {
        this.nume=nume;
    }

    @Override
    public String toString() {
        return "Cont{" +
                "nume='" + nume + '\'' +
                ", cont=" + cont +
                '}';
    }
}
