package B_15modCu11_ChainOfResp.main;

import B_15modCu11_ChainOfResp.clase.ModPlata;

public class Card extends ModPlata {
    private int sold;

    public Card(int sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(int suma, String nume) {
        if(sold < suma){
            super.succesor.plateste(suma,nume);
        }
        else{
            System.out.println(nume + " A platit cu cardul");
            sold-=suma;
        }
    }
}
