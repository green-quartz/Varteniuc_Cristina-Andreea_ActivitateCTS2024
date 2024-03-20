package A_1.A1_builder.cuInnerClassConcret.main;

import A_1.A1_builder.cuInnerClassConcret.model.AbstractBuilder;
import A_1.A1_builder.cuInnerClassConcret.model.Pacient;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder=new Pacient.PacientBuilder("Andrei");
        Pacient pacient=builder.adaugaMicDejunInclus(true).adaugaPapuciCamera(true).build();
        System.out.println(pacient);
    }
}
