package guverneleLumii.main;

import guverneleLumii.model.GuvernRegistry;


    public class Program {
        public static void main(String[] args) {
            GuvernRegistry guvernRegistry = GuvernRegistry.getInstance();
            guvernRegistry.adaugaGuvern("Romania","Popescu",5);
            guvernRegistry.adaugaGuvern("Romania","Andrei",7);
            guvernRegistry.adaugaGuvern("Ungaria","Ovidiu",10);

            System.out.println(guvernRegistry.getGuvern("Romania"));
            System.out.println(guvernRegistry.getGuvern("Ungaria"));


        }
    }

