package Testing;

import Testing.categorii.TesteEror;
import Testing.categorii.TesteRange;
import dubluri.PersoanaFake;
import model.IPersoana;
import model.PachetTuristic;
import model.Persoana;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.jupiter.api.Assertions.*;

public class PachetTuristicTest {

    @Test
    @Category(TesteRange.class)
    public void aplicaDiscountVarstnici() {
        IPersoana persoana = new Persoana("Florin", "50248239832");
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Dubai", 100.00);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(90,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(TesteRange.class)
    public void limitBounderyDiscountVarsnici(){
        IPersoana persoana = new Persoana("Florin", "15948239832");
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Dubai", 200.00);
        pachetTuristic.aplicaDiscountVarstnici(10);
        assertEquals(100,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(TesteRange.class)
    public void correctGetVarstaFake(){
        PersoanaFake persoana= new PersoanaFake();
        persoana.setVarsta(66);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Dubai", 250.00);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(200,pachetTuristic.getPret(),0.01);
    }

    @Test
    public void correctGetVarstaFakeNoDiscount(){
        PersoanaFake persoana= new PersoanaFake();
        persoana.setVarsta(20);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Dubai", 250.00);
        pachetTuristic.aplicaDiscountVarstnici(20);
        assertEquals(250.00,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(TesteRange.class)
    public void correctGetVarstaFakeNoDiscountForElders(){
        PersoanaFake persoana= new PersoanaFake();
        persoana.setVarsta(67);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Dubai", 250.00);
        pachetTuristic.aplicaDiscountVarstnici(0);
        assertEquals(250.00,pachetTuristic.getPret(),0.01);
    }

    @Test
    @Category(TesteRange.class)
    public void correctGetVarstaFakeNoDiscountFullDiscount(){
        PersoanaFake persoana= new PersoanaFake();
        persoana.setVarsta(100);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Dubai", 250.00);
        pachetTuristic.aplicaDiscountVarstnici(1000);
        assertEquals(00,pachetTuristic.getPret(),0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    @Category({TesteRange.class, TesteEror.class})
    public void correctGetVarstaFakeNoDiscountThrowsError(){
        PersoanaFake persoana= new PersoanaFake();
        persoana.setVarsta(100);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Dubai", 250.00);
        pachetTuristic.aplicaDiscountVarstnici(-10);
    }

    @Test(timeout =10)
    public void correctTestGetDiscountPerformance(){
        IPersoana persoana = new PersoanaFake();
        ((PersoanaFake)persoana).setVarsta(67);
        PachetTuristic pachetTuristic = new PachetTuristic(persoana,"Dubai", 250.00);
        pachetTuristic.aplicaDiscountVarstnici(10);
    }
}