package B_4_Prototype;

import java.util.HashMap;
import java.util.Map;

public class Client implements AbstractClient{

    private String nume;
    private String nrTelefon;
    private Map<String,Double> rezervare;

    public Client(String nume, String nrTelefon, Map<String,Double>rezervare){
        this.nume=nume;
        this.nrTelefon=nrTelefon;
        this.rezervare=rezervare;
    }
    private Client(){

    }

    public void setNumeClient(String numeClient) {
        this.nume=numeClient;
    }


    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon=nrTelefon;
    }

    @Override
    public AbstractClient cloneaza() {

        Client cleient=new Client();
        cleient.nume=this.nume;
        cleient.nrTelefon=this.nrTelefon;
        cleient.rezervare=new HashMap<>();
        for(String cheie:this.rezervare.keySet()){
            cleient.rezervare.put(cheie,this.rezervare.get(cheie));
        }
        return  cleient;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", rezervare=" + rezervare +
                '}';
    }
}
