package B_4_Prototype;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        Map<String,Double>rezervariClient=new HashMap<>();
        rezervariClient.put("1",1.00);
        rezervariClient.put("2",2.00);
        rezervariClient.put("3",3.00);
        AbstractClient client1=new Client("Ana","234",rezervariClient);
        AbstractClient client2=client1.cloneaza();
        client2.setNumeClient("Ion");
        client2.setNrTelefon("3074390");
        rezervariClient.put("4",4.00);
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client1);
    }
}
