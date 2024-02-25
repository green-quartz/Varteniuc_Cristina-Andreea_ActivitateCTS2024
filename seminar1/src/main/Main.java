package main;

import model.animal.Leu;
import model.animal.Maimuta;
import model.animal.Zebra;
import model.animal.Zookeper;
import model.zoo.Zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo=new Zoo("ZOO Bucuresti", new Zookeper("Dorel"),null);
        Leu leu = new Leu("Sparky", 4, 4);
        zoo.adaugaAnimal(leu,"carne de vita");
        zoo.adaugaAnimal(new Zebra("Morty",5,4),"iarba verde");
        zoo.adaugaAnimal(new Maimuta("Julian",3,4),"banane");
        zoo.hranesteToateAnimalele();
        TipuriAnimale tip = TipuriAnimale.LEU;
    }

    public enum TipuriAnimale{
        LEU,
        MAIMUTA,
        ZEBRA
    }
}