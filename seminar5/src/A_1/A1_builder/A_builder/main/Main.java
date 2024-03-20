package A_1.A1_builder.A_builder.main;

import A_1.A1_builder.A_builder.model.AbstractBuilder;
import A_1.A1_builder.A_builder.model.Pacient;
import A_1.A1_builder.A_builder.model.PacientBuilder;

public class Main {
    public static void main(String[] args) {
        AbstractBuilder builder = new PacientBuilder("Andrei");

        Pacient pacient =
                builder.adaugaHalatInterior()
                        .adaugaPapuciCamera()
                        .build();

        System.out.println(pacient);
    }
}
