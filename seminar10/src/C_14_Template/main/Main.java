package C_14_Template.main;

import C_14_Template.clase.AchizitieMedicamente;
import C_14_Template.clase.AchizitiePeBazaDeRerera;
import C_14_Template.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(1);
        reteta.adaugaMedicament("Paracetamol");
        reteta.adaugaMedicament("Paracetamol2");

        AchizitieMedicamente achizitieReteta=new AchizitiePeBazaDeRerera(reteta);
        achizitieReteta.achizitioneazaMedicamente();
    }
}
//nu intra momento si comand